package com.dyvak;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.*;

/**
 * Controller.java
 * <p>
 * It is class for engine of the validation.
 * Here we take view methods to show information about validation, menu, etc.
 * Also we take model methods to use business logic of this application.
 * Here are some input verifications
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 on 5.11.2016.
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    /**
     * Default constructor with view object initializing
     * @param  model activate model
     * @param  view activate view
     */
    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    /**
     * Main function in this class.
     * Main thread call this method from Main{@link Main}
     * This method makes menu and input all data from console
     * in correct way.
     */
    // The Work method
    public void processUser(){

        RegexConst regexConst = new RegexConst();

        validString(view.SURNAME, regexConst.STRING_REG);
        validString(view.NAME, regexConst.STRING_REG);
        validString(view.SECOND_NAME, regexConst.STRING_REG);


        view.printMessage(view.getSurname() +" "+ view.getName().charAt(0) + "."+ view.getSecondName().charAt(0) + ".");
        model.writeUserInformation(view.getSurname() + " " + view.getName().charAt(0) + "." + view.getSecondName().charAt(0) + ".");

        validString(view.NICKNAME, regexConst.STRING_REG);
        validString(view.COMMENT, regexConst.STRING_REG);

        validEnum();

        validString(view.HOME_PHONE, regexConst.PHONE_REG);
        validString(view.MOB_PHONE, regexConst.PHONE_REG);
        validString(view.MOB_PHONE_2, regexConst.PHONE_REG_PLUS_NULL);
        validString(view.MAIL, regexConst.MAIL_REG);
        validString(view.SKYPE, regexConst.STRING_REG);
        validString(view.INDEX, regexConst.NUMBER_REG);
        validString(view.CITY, regexConst.STRING_REG);
        validString(view.STREET, regexConst.STRING_REG);
        validString(view.HOME_NUMBER, regexConst.NUMBER_REG);

        view.printMessage(view.DATE + String.valueOf(new Date()));
        model.writeUserInformation(new Date() + "\n" + view.SEPARATOR);
    }

    /**
     * 1. prints a message and displays a list of all possible values for validation,
     * which are located in the enum @Groups
     * 2. scans value userLine, entered by the user from the keyboard.
     * 3. transmits the value userLine to the class model and write information to a file
     */
    private void validEnum() {
        view.printMessage(view.GROUP+(Arrays.toString(Groups.values())));
        Scanner sc = new Scanner(System.in);
        String userLine = sc.nextLine();
        model.writeUserInformation(userLine);
    }

    /**
     * transferred in this method two values String messageForValidation and String regexRule,
     * the user enters a value userInputLine with the keyboard,
     * userInputLine checking validator for compliance, use regexRule,
     * if userInputLine it is NAME, SURNAME, or SECOND_NAME,
     * These class values are set in the state for further use
     * values are passed on through a method checkInput in model class for writing to a file
     * @param messageForValidation firstly print messageForValidation for user,
     * @param regexRule rule for passing validation
     */
    private void validString(String messageForValidation, String regexRule) {
        Scanner sc = new Scanner(System.in);
        view.printMessage(messageForValidation);
        String userInputLine = sc.nextLine();
        checkInput(userInputLine, regexRule);
        if(messageForValidation.equals(view.SURNAME)) {
            view.setSurname(userInputLine);
        }if(messageForValidation.equals(view.NAME)){
            view.setName(userInputLine);
        }else{
            view.setSecondName(userInputLine);
        }
    }

    /**
     * In this method, there is validation of input values.
     * Into the method passed the two values userInputLine that determine what message
     * will be displayed to the user for input data,
     * and regexRule determine the type of validation that will be applied for this userInputLine.
     * @param userInputLine user input this line from console
     * @param regexRule rule for passing validation
     */
    // The Utility methods
    protected void checkInput(String userInputLine, String regexRule) {
        Pattern pattern = Pattern.compile(regexRule);
        Matcher matcher = pattern.matcher(userInputLine);
        if (matcher.matches()) {
            view.printMessage(view.VALIDATION + userInputLine + view.PASSED);
            model.writeUserInformation(userInputLine);
        }else {
            view.printMessage(view.VALIDATION + userInputLine +
                    view.NOT_PASSED);
        }
    }

}

