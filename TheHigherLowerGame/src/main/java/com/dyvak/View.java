package com.dyvak;

import java.util.List;

/**
 * View.java
 * <p>
 * It is class for showing some information.
 * It print some game information.
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 on 29.10.2016.
 */
public class View {



    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String CONGRATULATION = "You win INT value = ";
    public static final String INTRODUCTION = "Welcome to the game. Man against computer.";
    public static final String NEW_DIAPASON = "New diapason ";
    public static final String HISTORY = "History: ";

    /**
     * Methods for showing information on different threads
     * (not only out). If we will need to refactor output,
     * we can do this simple in one line.
     *
     * @param message string sequence, which we will need to print
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     *  @param message string sequence, which we will need to print
     */

    public void printMessageAndInt(String message, int value) {
        System.out.println(message + value);
    }

    /**
     * Method for print the values of this ArrayList,
     * meaning I am printing out the contents of the Array,
     * in this case numbers.
     *
     * @param list which we will need to print
     */
    public static void printArrayList(List<?> list) {
        for (Object i : list) {
            System.out.print(i+"  ");
        }
        System.out.println();
    }
}
