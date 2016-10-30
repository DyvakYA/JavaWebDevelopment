package com.dyvak;

/**
 * Main.java
 * <p>
 * Start point of the game.
 * Here we will start controller {@link Controller}
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 on 29.10.2016.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // Initialization

        com.dyvak.Model model = new com.dyvak.Model();

        View view = new View();
        Controller controller = new Controller(model, view);

        // Run
        controller.processUser();
    }

}
