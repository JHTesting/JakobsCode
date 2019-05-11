import static java.lang.Character.toLowerCase;

/**
 * Node class
 * This class represents a node of a trie. A trie consists of multiple nodes.
 */
public class Node {

    private char ch;
    private Integer points;
    private Node[] children;
    private Node parent;

    /**
     * constructor for a root node
     * A root node always has '+' as the character associated with it.
     * Obviously, the root also does not have a parent node.
     * The root node also does not have an integer value associated with it,
     * which is why the attribute points is set to null.
     * This constructor does not take any arguments, as the root node is
     * always the same.
     */
    public Node() {
        this.ch = Constants.ROOT_NODE_CHAR;
        this.points =  null;
        this.children = new Node[Constants.ALPHABET_SIZE];
        this.parent = null;
    }

    /**
     * Constructor for a normal node.
     * Sets the parent node of this node and the current node as a child node of
     * its parent.
     * The attribute ch represents the value of the edge ABOVE the current node
     * Points is set to null at time of construction, as most nodes do not
     * have a value associated with it. Can be changed by calling the
     * setPoints method.
     * @param ch value of the edge ABOVE this node
     * @param parent parent node of this node
     */
    public Node(char ch, Node parent) {
        this.ch = ch;
        this.parent = parent;
        this.points = null;
        this.children = new Node[Constants.ALPHABET_SIZE];
        this.parent.setChild(ch, this);
    }


    /**
     * Getter method for child node at character ch.
     * ch is first converted to lowercase, as all chars are stored as
     * lowercase characters.
     * Returns null if ch is not a valid letter.
     * Returns the node at character ch in the children array otherwise.
     * @param ch gets the child of this node for character ch
     * @return the node at character ch
     */
    public Node getChild(char ch) {

        // all chars are stored as lowercase characters
        ch = toLowerCase(ch);
        int index = ch - 'a';
        if (index < 0 || index >= Constants.ALPHABET_SIZE) {
            return null;
        }


        return children[index];

    }

    /**
     * This function indicates if the given node has any children by iterating
     * over the children array and checking
     * if one of the children is not null. If at least one child node exists,
     * the function returns true, otherwise it returns false.
     * @return true if there are any children that are not null, false
     * otherwise.
     */
    private boolean hasChildren() {
        for (int i = 0; i < Constants.ALPHABET_SIZE; i++) {
            if (this.children[i] != null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method to remove the node on which the method is called.
     * Delegates the actual removing to the cleanup helper method,
     * which removes unnecessary nodes above this node and the node itself.
     */
    public void remove() {
        cleanup(this);
    }

    private void cleanup(Node nodeToRemove) {

        // The only node whose parent is null is the root node, which is
        // never useless
        if (parent == null) {
            return;
        }

        nodeToRemove.setPoints(null);

        while (nodeToRemove.parent != null) {

            if (nodeToRemove.getPoints() != null
                    || nodeToRemove.hasChildren()) {
                return;
            }

            Node nodeParent = nodeToRemove.getParent();
            nodeParent.setChild(nodeToRemove.getCh(), null);
            nodeToRemove = nodeParent;

        }
    }

    /**
     * Method to find a node in the trie.
     * The method first checks if the key find is null, returns null if it is.
     * The node starts searching for the key
     * from the node on which it is called downwards.
     * Therefore, the method doesn't necessarily search the whole trie for
     * the key, except if it is called on the root node.
     * @param key key we are searching the value for
     * @return node which holds the value for key or null if the key is not
     * in the trie.
     */
    public Node find(String key) {

        if (key == null) {
            return null;
        }

        int length = key.length();

        Node searchNode = this;

        for (int i = 0; i < length; i++) {
            char ch = key.charAt(i);

            // terminates if there is no matching node.
            if (searchNode.getChild(ch) == null
                    && searchNode.getPoints() == null) {
                return null;
            }

            searchNode = searchNode.getChild(ch);

        }
        if (searchNode.getPoints() == null) {
            return null;
        }

        // returns the node containing the LAST character of the key
        return searchNode;
    }


    /**
     * Method to set a node as a child of this node.
     * @param ch character which to set the child for
     * @param child node to set as child
     */
    private void setChild(char ch, Node child) {
        int index = ch - 'a';
        children[index] = child;
    }

    /**
     * Setter method for the class attribute points
     * @param points variable which to set the attribute points to
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * Getter method for the class attribute points
     * @return value of the attribute points
     */
    public Integer getPoints() {
        return this.points;
    }

    /**
     * Getter method for the parent attribute. Returns parent node of this node.
     * @return parent node of this node.
     */
    public Node getParent() {
        return parent;
    }

    /**
     * Setter method for the parent attribute.
     * @param parent parent to set as this node's parent.
     */
    public void setParent(Node parent) {
        this.parent = parent;
    }

    /**
     * Getter method for char attribute
     * @return value of char
     */
    private char getCh() {
        return ch;
    }

    /**
     * Setter method for char attribute
     * @param ch value to set the char attribute to
     */
    public void setCh(char ch) {
        this.ch = ch;
    }

    /**
     * Returns a string representation of this node and its children
     * @return string representation of this node and its children.
     */
    @Override
    public String toString() {

        StringBuilder nodeToString = new StringBuilder(Character.toString(ch));

        if (this.getPoints() != null) {
            String pointString = "[" + this.getPoints() + "]";
            nodeToString.append(pointString);
        }

        if (this.hasChildren()) {
            nodeToString.append("(");
            for (Node child : children) {
                if (child != null) {
                    nodeToString.append(child);
                }
            }
            nodeToString.append(")");
        }

        return nodeToString.toString();
    }

}