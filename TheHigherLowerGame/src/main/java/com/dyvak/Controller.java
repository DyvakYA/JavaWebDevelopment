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
    Model model;
    View view;

    String userValue;
    ArrayList userValues = new ArrayList();

    /**
     * Default constructor with view object initializing
     */
    // Constructor
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

        model.setValueDiapason(GlobalConstants.MIN_COMP_VALUE_DIAPASON,
                GlobalConstants.MAX_COMP_VALUE_DIAPASON);

        model.setCompValue();
        //System.out.println(model.getCompValue()); //hint

        /**
         * Introduction, print allowable range,and show input message
         */
        view.printMessage(view.INTRODUCTION);

        while (!model.checkValue(inputIntValueWithScanner(sc))){}
        view.printMessage(View.CONGRATULATION + model.getCompValue());
        /**
         * enter userValue
         * set in @param value
         * and add userValue in ArrayList
         */


        /**
         * checking equals userValue and compValue,
         * change diapasons and
         * return boolean value for determine win or lose
         */

    }

    /**
     * Checking input values.
     * Verifying on integer digits.
     *
     * @param sc Scanner, which has created in processUser
     * @return integer value of number from console
     */
    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {

        int res=0;
        view.printMessage(View.INPUT_INT_DATA
                + model.getMinCompValueDiapason()
                + "-" +
                + model.getMaxCompValueDiapason());

        while (true) {

            //check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA
                        + View.INPUT_INT_DATA);
                sc.next();
            }
            //check value in diapason
            if ((res = sc.nextInt()) <= model.getMinCompValueDiapason() ||
                    res >= model.getMaxCompValueDiapason()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA
                        + View.INPUT_INT_DATA);
                continue;
            }
            break;
        }
        userValues.add(res);
        //change history
        view.printMessage(View.HISTORY);
        view.printArrayList(userValues);
        return res;
    }
}






