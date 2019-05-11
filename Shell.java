import java.util.Arrays;
import java.util.Scanner;

/**
 * Shell class to get and evaluate user input. The user input is converted
 * into commands and passed to the trie, which then executes the commands
 * given to the shell.
 */
public final class Shell {

    private Scanner reader;
    private Trie trie;

    /**
     * Constructor for a new shell class.
     */
    public Shell() {
        this.reader = new Scanner(System.in);
        this.trie = new Trie();
    }


    /**
     * Method to get input from the user by using the nextLine method of the
     * Scanner object.
     * @return user input as a string
     */
    private String getInput() {
        return reader.nextLine();
    }

    /**
     *  This method evaluates the input given to the shell and prints an error
     *  message if it is invalid. The input is first converted into valid
     *  input and then evaluated. The evaluated input is then passed to the
     *  correct helper method, which executes the command and performs the
     *  requested action on the trie.
     */
    public void evaluateInput() {

        // This solution is not optimal. I don't like having the same block
        // of code twice in the same method. I have tried making a new
        // method, but it did not work out the way I wanted to. I will leave
        // it as it is, I hope to find a better solution at some point.
        System.out.print(Constants.SHELL_PROMPT);
        String[] inputArray = splitInput(getInput());
        String input = inputArray[0];
        input = input.toUpperCase();

        while (!input.equals("QUIT")) {

            switch (input) {

                case ("NEW"):

                    trie = new Trie();
                    break;

                case ("ADD"):

                    addKey(inputArray[1], tryParseStrToInt(inputArray[2]));
                    break;

                case ("CHANGE"):

                    changeKey(inputArray[1], tryParseStrToInt(inputArray[2]));
                    break;

                case ("DELETE"):

                    deleteKey(inputArray[1]);
                    break;

                case ("POINTS"):

                    getPointsForKey(inputArray[1]);
                    break;

                case ("TRIE"):

                    printTrie();
                    break;

                case ("HELP"):

                    printHelp();
                    break;

                default:
                    System.out.println("Error! Invalid command.");
            }

            System.out.print(Constants.SHELL_PROMPT);

            inputArray = splitInput(getInput());
            input = inputArray[0];
            input = input.toUpperCase();

        }
    }

    /**
     * Method to add a new key to the trie. The method takes two parameters:
     * The key to add and the value associated with the key.The method first
     * checks if the key, value pair given is valid. If it is, the add method
     * of the trie class is called. If adding the key was not successful,
     * an error message is printed.
     * @param key key to add to the trie
     * @param points points associated with the key
     */
    private void addKey(String key, Integer points) {
        if (checkForInvalidKey(key) || checkForInvalidValue(points)) {
            invalidInputError();
            return;
        }

        if (!trie.add(key, points)) {
            System.out.println("Error! " + key + " could not be added.");
        }
    }

    /**
     * Method to change the value of a key that has already been added to the
     * trie. The method first checks if the key value pair given is valid and
     * then proceeds to call the change method of the trie. If changing the
     * value of key was unsuccessful, an error message is printed.
     * Otherwise the value associated with key is changed.
     * @param key key to change
     * @param points value to change to
     */
    private void changeKey(String key, Integer points) {
        if (checkForInvalidKey(key) || checkForInvalidValue(points)) {
            invalidInputError();
            return;
        }

        if (!trie.change(key, points)) {
            System.out.println("Error! " + key + " could not be changed to "
                    + points + ".");
        }
    }

    /**
     * Method to delete a key from the trie. The method takes as parameter
     * the key which to delete and checks if it is a valid input.
     * Key has to have been added to the trie before.
     * If the key could not be deleted, an error message is printed.
     * Otherwise the key is deleted.
     * @param key key which to delete from the trie.
     */
    private void deleteKey(String key) {
        if (checkForInvalidKey(key)) {
            invalidInputError();
            return;
        }
        if (!trie.remove(key)) {
            System.out.println("Error! " + key + " could not be removed.");
        }
    }

    /**
     * Method to get the value associated with key. The method first checks
     * if the key given is a valid input. If it is, the points method of the
     * trie is called. If the key is not in the trie, an error message is
     * printed. Otherwise the points for key are printed.
     * @param key key which to get the points for
     */
    private void getPointsForKey(String key) {
        if (checkForInvalidKey(key)) {
            invalidInputError();
            return;
        }
        Integer points = trie.points(key);
        if (points == null) {
            System.out.println("Error! " + key + " is not a valid key!");
        } else {
            System.out.println(points);
        }
    }

    /**
     * This method only serves to make the code more readable. It does
     * nothing except call the toString method of the trie class and thus
     * returns nothing.
     */
    private void printTrie() {
        System.out.println(trie);
    }

    /**
     * Prints a helpful info about how to use the trie, which commands are
     * valid and what kind of input is accepted.
     */
    private void printHelp() {

        String helpString = "NEW: Creates new trie\n"
                + "ADD s x: New key s with value x (x must be an integer >= "
                + "0)\n"
                + "CHANGE s x: Change value of key s to x\n"
                + "DELETE s: Delete key s\n"
                + "POINTS s: Print value of key s\n"
                + "TRIE: Print string representation fo trie\n"
                + "QUIT: Quit the program\n"
                + "HELP: Show this helpful guide\n";
        System.out.println(helpString);

    }

    /**
     * This method cleans up user input and converts it into a string array
     * of size 3, as that is the maximum number of parameters allowed for any
     * given input. First trim is called to remove any unnecessary whitespace
     * from the input. The input is then split and transferred into a new
     * array, which is then returned. This method makes it easier to evaluate
     * user input.
     * @param input input given by the user as a string
     * @return cleaned up input, split by whitespace and stored in a string
     * array of size 3.
     */
    private String[] splitInput(String input) {

        input = input.trim();
        String[] inputArray = input.split(" ");
        String[] trimmedArray = new String[3];

        trimmedArray = Arrays.copyOfRange(inputArray, 0, 3);

        return trimmedArray;
    }

    /**
     * This method tries to convert a string into an Integer object. If the
     * given string can be converted, the parsed string is returned as an
     * Integer. If the given input is not valid, null is returned.
     * @param stringToParse string to convert to an integer object
     * @return parsed string, null if it couldn't be converted.
     */
    private Integer tryParseStrToInt(String stringToParse) {
        try {
            return Integer.parseInt(stringToParse);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * This method is just a helper method to make the code more readable. It
     * prints an error message in case the input is invalid.
     */
    private void invalidInputError() {
        System.out.println("Error! The input is invalid.");
    }

    /**
     * This method checks if a given key is a valid input for the
     * trie. Key may not be null, it mustn't contain any uppercase
     * characters and it mustn't be empty.
     * @param key key to check
     * @return true if key is invalid, false otherwise.
     */
    private boolean checkForInvalidKey(String key) {

        if (key == null) {
            return true;
        }

        return !key.toLowerCase().equals(key)
                || key.equals("")
                || key.equals(" ");
    }

    /**
     * This method checks if a given value is a valid input for the
     * trie. Value may be null and the value must be >= 0.
     * @param points value to check
     * @return true if key is invalid, false otherwise.
     */
    private boolean checkForInvalidValue(Integer points) {
        if (points == null) {
            return true;
        }

        return points < 0;
    }

    /**
     * Main method for the Shell class. Calls the evaluateInput method, which
     * then takes input
     * @param args arguments for main
     */
    public static void main(String[] args) {
        Shell shell = new Shell();
        shell.evaluateInput();
    }

}
