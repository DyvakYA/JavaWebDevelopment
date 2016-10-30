package com.dyvak;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dyvak on 29.10.2016.
 */
public class View {
    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String WIN_INT = "You win INT value = ";
    public static final String INTRODUCTION = "Welcome to the game. Man against computer.Guess the number of ";
    public static final String NEW_DIAPASON = "New diapason ";
    public static final String HISTORY = "History: ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value) {
        System.out.println(message + value);
    }

    public static void printArrayList(List<?> list) {
        for (Object i : list) {
            System.out.print(i+"  ");
        }
        System.out.println();
    }
}
