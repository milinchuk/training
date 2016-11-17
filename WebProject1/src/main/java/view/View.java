package view;

/**
 * Created by click on 11/14/2016.
 */
public class View {
    public static final String COST = "Station cost: ";
    public static final String FIND_AUTOMOBILES = "Find: ";
    public static String AUTOMOBILES;

    public void print(String message, String argument) {
        System.out.println(message + argument);
    }
}
