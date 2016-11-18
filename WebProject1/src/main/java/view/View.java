package view;

/**
 * This is view of project
 *
 * @author Anastasia Milinchuk
 */
public class View {
    /*
    Constant variables
     */
    public static final String COST = "Station cost: ";
    public static final String FIND_AUTOMOBILES = "Find: ";
    public static final String AUTOMOBILES = "Automobiles:";

    /**
     * This method show message
     *
     * @param message is message from constant variables
     * @param argument is string argument
     */
    public void print(String message, String argument) {
        System.out.println(message + argument);
    }
}
