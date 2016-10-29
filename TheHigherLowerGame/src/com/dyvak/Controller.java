package com.dyvak;

import java.util.Scanner;

/**
 * Created by Dyvak on 29.10.2016.
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

        // The Work method
        public void processUser(){
            Scanner sc = new Scanner(System.in);

            model.randomValue();
            System.out.println(model.getRandomValue());

            view.printMessage(view.INPUT_INT_DATA);
            model.setValue(sc.nextInt());

            checkCurrentValue(sc);


        }

        // The Utility methods

    public void checkCurrentValue(Scanner sc) {

        boolean bol = true;

        int res;

       do {

            res = model.checkResult();

            if (res == 0) {
                view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
                view.printMessage("New diapason " + model.getMinCommonValueDiapason() + "-" + model.getMaxCommonValueDiapason());
                model.setValue(sc.nextInt());
            }else
             {
                view.printMessageAndInt(view.OUR_INT, model.getValue());
                bol = false;
            }


        }while (bol);
    }
}