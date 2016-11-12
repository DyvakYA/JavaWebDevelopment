package CofeeMachine;

/**
 * Created by User on 17.03.2016.
 */
public class View {
    // Text's constants
    public final String INPUT_INT_DATA = "Input INT value = ";
    public final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public final String OUR_INT = "INT value = ";
    public final String SEPARATOR = "-------------------------";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value){
        System.out.println(message + value);
    }

}
