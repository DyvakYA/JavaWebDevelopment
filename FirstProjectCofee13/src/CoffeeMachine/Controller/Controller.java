package CoffeeMachine.Controller;

import CoffeeMachine.Filter.CoffeePredicate;
import CoffeeMachine.Filter.Filter;
import CoffeeMachine.Filter.Predicate;
import CoffeeMachine.Model.Coffee;
import CoffeeMachine.Model.Model;
import CoffeeMachine.View;

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

        view.printMessage(view.SEPARATOR+view.FILTER_BY_COFFEE_TYPE+view.SEPARATOR);
        coffee = getCoffees(coffee, CoffeePredicate.byCoffeeType("CornCoffee"));

        view.printMessage(view.SEPARATOR+view.FILTER_BY_WEIGHT+view.SEPARATOR);
        coffee = getCoffees(coffee, CoffeePredicate.byWeight(100.00, 300.00));

        view.printMessage(view.SEPARATOR+view.FILTER_BY_PRICE+view.SEPARATOR);
        coffee = getCoffees(coffee, CoffeePredicate.byPrice(1200.00, 2000.00));
    }

    private List<Coffee> getCoffees(List<Coffee> coffee, Predicate<Coffee> predicate) {
        coffee = Filter.filter(coffee, predicate);
        coffee.forEach(System.out::println);
        return coffee;
    }
}
