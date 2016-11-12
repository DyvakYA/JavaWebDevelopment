package CofeeMachine;

import CofeeMachine.Filter.CoffeePredicate;
import CofeeMachine.Filter.Filter;
import CofeeMachine.Model.Coffee;
import CofeeMachine.Model.Model;

import java.util.List;

/**
 * Created by User on 17.03.2016.
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    //The Work method
    public void processUser(){

        Model model = new Model();

        List<Coffee> coffee = model.Coffee();

        coffee = Filter.filter(coffee, CoffeePredicate.byCoffeeType("CornCoffee"));
        view.printMessage(view.SEPARATOR);
        coffee.forEach(System.out::println);

        coffee = Filter.filter(coffee, CoffeePredicate.byPrice(1200.00, 2000.00));
        view.printMessage(view.SEPARATOR);
        coffee.forEach(System.out::println);

        coffee = Filter.filter(coffee, CoffeePredicate.byWeight(100.00, 300.00));
        view.printMessage(view.SEPARATOR);
        coffee.forEach(System.out::println);
    }

    // The Utility methods
    public void inputIntValueWithScanner() {
    }
}
