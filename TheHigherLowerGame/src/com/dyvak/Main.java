package com.dyvak;

/**
 * Created by Dyvak on 29.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        // Initialization

        com.dyvak.Model model = new com.dyvak.Model();

        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }

}
