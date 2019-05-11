/**
 * Trie data structure
 */

public class Trie {

    private final Node root;

    /**
     * Constructor for a new trie data structure.
     * A new trie always has a root node, which is why a new node is made
     * when a new trie object is constructed.
     */
    public Trie() {
        this.root = new Node();
    }

    /**
     * Method to add a new key, value pair to the trie.
     * Duplicate keys or null for either key or points may not be added and
     * will result in the method returning false.
     * If these conditions are not met, the new key will be added to the trie.
     * Its value will be stored in the node containing the last character of
     * the key.
     * Returns true if the key was successfully added to the trie
     * @param key key to add to the trie
     * @param points value associated with the new key, mustn't be null
     * @return true if adding the key was succesful, false otherwise
     */
    public boolean add(String key, Integer points) {

        if (key == null || points == null) {
            return false;
        }
        Node currentNode = root;

        char ch;
        for (int i = 0; i < key.length(); i++) {

            ch = key.charAt(i);

            if (currentNode.getChild(ch) == null) {
                // if the current node does NOT have a child at ch, create a
                // new child
                // set the current node to the newly created one

                Node nodeToInsert = new Node(ch, currentNode);
                currentNode = nodeToInsert;

            } else {
                // if it DOES have a child at ch, set the current node to that
                // node and continue from there
                currentNode = currentNode.getChild(ch);

            }
        }

        if (currentNode.getPoints() == null) {
            currentNode.setPoints(points);
            return true;
        }

        // only return false if the current node already has points
        // associated with it
        return false;

    }

    /**
     * Method to change the value of a key that is already stored in the trie.
     * The method first checks if the key to change has already been added,
     * or if the new value is equal to the current value. If either of these
     * conditions is true, the
     * method returns false.
     * Otherwise the value for the key is changed and true is returned.
     * @param key key which value is to be changed
     * @param points new value for the key
     * @return true if key was succesfully changed, false otherwise.
     */
    public boolean change(String key, Integer points) {

        // calls find method of node class to find the node to change
        Node nodeToChange = root.find(key);

        if (nodeToChange == null
                || points == null
                || nodeToChange.getPoints() == null) {
            return false;
        }

        nodeToChange.setPoints(points);
        return true;
    }

    /**
     * Method to get the value for a key that has already been added to the
     * trie.
     * The method first checks if the key is already in the trie. If it
     * isn't, null is returned.
     * Otherwise the value for key is returned.
     * @param key key which value to get
     * @return the value for key, may be null.
     */
    public Integer points(String key) {

        Node node = root.find(key);
        if (node == null) {
            return null;
        }

        return node.getPoints();

    }

    /**
     * Method to remove a key from the trie.
     * The method first checks if the key is already in the trie, returns
     * false if it isn't.
     * If the value of the key is null, the method also returns false.
     * Otherwise the node is removed and true is returned.
     * @param key key to remove from the trie
     * @return true if key was successfully removed, false otherwise.
     */
    public boolean remove(String key) {

        Node nodeToRemove = root.find(key);

        if (nodeToRemove == null || nodeToRemove.getPoints() == null) {
            return false;
        }

        nodeToRemove.remove();
        return true;

    }

    /** Returns a string representation of the trie. The method is nothing
     * more than a function call of the toString
     *  method of the root node, which then performs a depth first search of
     *  the trie.
     * @return string representation of the trie
     */
    @Override
    public String toString() {
        return root.toString();
    }

}
