package com.dyvak;

import java.util.ArrayList;
import java.util.Scanner;

/**Controller.java
 * <p>
 * It is class for engine of the game.
 * Here we take view methods to show information about game, menu, etc.
 * Also we take model methods to use business logic of this game.
 * Here are some input verifications
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 on 29.10.2016.
 */

public class Controller {

    /**
     * Objects of model and view, which we will instantly in constructor
     */
    // Constructor
    Model model;
    View view;


    int userValue;
    ArrayList userValues = new ArrayList();

    /**
     * Default constructor with view object initializing
     */
    public Controller() {
    }

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Main function in this class.
     * Main thread call this method from Main{@link Main}
     * This method makes menu and input all data from console
     * in correct way. Also it makes and show statistic using
     * data, which we create during playing the game
     */

    // The Work method
    public void processUser(){
         /* Scanner to makes input from console */
        Scanner sc = new Scanner(System.in);

        model.compValue();
        //System.out.println(model.getCompValue()); /hint

        /**
         * Introduction, print allowable range,and show input message
         */

        view.printMessage(view.INTRODUCTION + model.getMinCompValueDiapason() + "-" + model.getMaxCompValueDiapason());
        view.printMessage(view.INPUT_INT_DATA);

        /**
         * enter userValue
         * set in @param value
         * and add userValue in ArrayList
         */
        int userValue = sc.nextInt();
        model.setUserValue(userValue);
        userValues.add(userValue);

        /**
         * checking equals userValue and compValue,
         * change diapasons and
         * return boolean value for determine win or lose
         */
        checkCurrentValue(sc);
    }


    /**
     * Checking input values.
     * Verifying on integer digits.
     *
     * @param sc Scanner, which has created in processUser
     * return integer value of number from console
     */
    // The Utility methods
    public void checkCurrentValue(Scanner sc) {

        do {

            boolean res = model.checkResult();

            if (res == false) {
                    view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
                    view.printMessage(view.NEW_DIAPASON + model.getMinCompValueDiapason() + "-" + model.getMaxCompValueDiapason());

                    //change history
                    view.printMessage(view.HISTORY);
                    view.printArrayList(userValues);


                    userValue=sc.nextInt();
                    model.setUserValue(userValue);

                    //add to arrayList for history of userValues
                    userValues.add(userValue);
                } else {
                    view.printMessageAndInt(view.WIN_INT, model.getUserValue());
                    break;
                }
        } while (true);
    }
}



