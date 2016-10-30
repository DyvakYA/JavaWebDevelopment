package com.dyvak;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Dyvak on 29.10.2016.
 */
public class Controller {

    // Constructor
    Model model;
    View view;
    int userValue;
    ArrayList userValues = new ArrayList();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public Controller() {

    }

    // The Work method
    public void processUser() throws Exception {
        Scanner sc = new Scanner(System.in);

        model.randomValue();
        //System.out.println(model.getRandomValue()); /hint

        view.printMessage(view.INTRODUCTION + model.getMinCompValueDiapason() + "-" + model.getMaxCompValueDiapason());
        view.printMessage(view.INPUT_INT_DATA);

        int userValue = sc.nextInt();
        model.setValue(userValue);
        userValues.add(userValue);

        checkCurrentValue(sc);
    }

    // The Utility methods

    public void checkCurrentValue(Scanner sc) {

        do {

            boolean res = model.checkResult();

            //int userValue = sc.nextInt();

             if (res == false) {
                    view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
                    view.printMessage(view.NEW_DIAPASON + model.getMinCompValueDiapason() + "-" + model.getMaxCompValueDiapason());
                    view.printMessage(view.HISTORY);
                    view.printArrayList(userValues);
                    userValue=sc.nextInt();
                    model.setValue(userValue);
                    userValues.add(userValue);
                } else {
                    view.printMessageAndInt(view.WIN_INT, model.getValue());
                    break;
                }
        } while (true);
    }
}



