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

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setValue(inputIntValueWithScanner(sc));
        model.commonValue();
        model.checkResult(inputIntValueWithScanner(sc), model.commonValue());

        view.printMessageAndInt(view.OUR_INT, model.getValue());
    }

    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}
