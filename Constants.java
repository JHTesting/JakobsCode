/**
 * Constants class
 * Contains constants for trie and shell class
 */
public final class Constants {

    private Constants() {
    }
    /**
     * First letter to be allowed as a valid input
     */
    public static final char FIRST_CHAR = 'a';

    /**
     * Last letter to be allowed as a valid input
     */
    public static final char LAST_CHAR = 'z';

    /**
     * Constant for the size of the alphabet, calculated by subtracting the
     * first allowed char from the last allowed char and adding 1.
     * Every node has exactly one child for each letter of the alphabet, ergo
     * each node has exactly 26 children.
     * These children nodes are stored in an array, see Node class for more
     * info.
     */
    public static final int ALPHABET_SIZE = LAST_CHAR - FIRST_CHAR + 1;


    /**
     * Constant for the shell prompt.
     * This constant indicates to the user that a command may be entered.
     */
    public static final String SHELL_PROMPT = "trie> ";

    /**
     * Constant for the character associated with the root node.
     */
    public static final char ROOT_NODE_CHAR = '+';
}
