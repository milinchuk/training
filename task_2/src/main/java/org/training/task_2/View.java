package org.training.task_2;

import java.util.Scanner;

/**
 * This is presentation layer
 */
public class View {
    // Text's constants
    public static final String GREETING = "Welcome to MORELESS game! You can detect own interval in range (0, 100). " +
            "Number from intervals must contains only numbers and end of interval must be bigger for start at least " +
            "at 1. \n" +
            "I imagine a secret number between this interval. \n" +
            "And you try to gues it. Let's start!";
    public static final String START_INTERVAL = "Input start of interval: ";
    public static final String END_INTERVAL = "Input end of interval: ";
    public static final String INPUT_INT_DATA = "Input INT value in range: ";
    public static final String MIN_BARRIER = " min: ";
    public static final String MAX_BARRIER = " max: ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String WRONG_RANGE_DATA = "Wrong range! Repeat please! ";
    public static final String CONGRATULATION = "CONGRATULATION!!! Secret value = ";
    public static final  String INTERVAL_CHOOSE = "Okay. Interval has choosen. And now try to " +
            "guess which number I image.";

    /**
     * Method for printing message from controller on screen
     *
     * @param message is {@link String} value which passed by controller
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     * Concatenation and printing multiply messages
     *
     * @param message is {@link String} multiple values which passed by controller
     */
    public void concatenationAndPrint(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        printMessage(new String(concatString));
        //System.out.println(concatString);
    }

}
