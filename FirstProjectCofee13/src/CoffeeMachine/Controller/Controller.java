package CoffeeMachine.Controller;

import CoffeeMachine.Comparator.MultiComparator;
import CoffeeMachine.Comparator.OrderedComparator;

import CoffeeMachine.Filter.CoffeePredicate;
import CoffeeMachine.Filter.Filter;
import CoffeeMachine.Filter.Predicate;
import CoffeeMachine.Model.Coffee;
import CoffeeMachine.Model.Model;
import CoffeeMachine.View;

import static CoffeeMachine.Comparator.OrderedComparator.Order.DESC;
import static CoffeeMachine.Comparator.CoffeeComparator.PRICE_WEIGHT;

import java.util.Collections;
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
    //    coffee = getCoffees(coffee, CoffeePredicate.byCoffeeType("CornCoffee"));

        view.printMessage(view.SEPARATOR+view.FILTER_BY_WEIGHT+view.SEPARATOR);
        coffee = getCoffees(coffee, CoffeePredicate.byWeight(100.00, 500.00));

        view.printMessage(view.SEPARATOR+view.FILTER_BY_PRICE+view.SEPARATOR);
        coffee = getCoffees(coffee, CoffeePredicate.byPrice(1000.00, 2000.00));

        Collections.sort(coffee, new MultiComparator<>(
                new OrderedComparator<>(PRICE_WEIGHT, DESC)
        ));
        view.printMessage(view.SEPARATOR+view.SORT_BY_PRICE_WEIGHT+view.SEPARATOR);
        coffee.forEach(System.out::println);

    }

    private List<Coffee> getCoffees(List<Coffee> coffee, Predicate<Coffee> predicate) {
        coffee = Filter.filter(coffee, predicate);
        coffee.forEach(System.out::println);
        return coffee;
    }
}
