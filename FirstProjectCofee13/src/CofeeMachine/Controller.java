package CofeeMachine;

/**
 * Created by User on 17.03.2016.
 */
public class Controller {
    // The Constants
    public static final double PI = 3.14;

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    //The Work method
    public void processUser(){
       model.Coffee();
    }

    // The Utility methods
    public void inputIntValueWithScanner() {

    }
}
