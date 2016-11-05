package com.dyvak;

/**
 * Created by User on 17.03.2016.
 */
public class View {
    // Text's constants
    public static final String VALIDATION = "Validation for ";
    public static final String PASSED = " passed.";
    public static final String NOT_PASSED = " not passed.";
    public static final String SEPARATOR = "--------------------------------------------------";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value){
        System.out.println(message + value);
    }

}
