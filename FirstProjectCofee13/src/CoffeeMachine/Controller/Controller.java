package CoffeeMachine.Controller;

import CoffeeMachine.Comparator.*;
import CoffeeMachine.Filter.*;
import CoffeeMachine.Model.*;
import CoffeeMachine.View;

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

        //Filter by coffee type
        view.printMessage(view.SEPARATOR+view.FILTER_BY_COFFEE_TYPE+view.SEPARATOR);
//        coffee = getCoffees(coffee, CoffeePredicate.byCoffeeType("CornCoffee"));

        //Filter by weight
        view.printMessage(view.SEPARATOR+view.FILTER_BY_WEIGHT+view.SEPARATOR);
        coffee = getCoffees(coffee, CoffeePredicate.byWeight(100.00, 500.00));

        //Filter by price
        view.printMessage(view.SEPARATOR+view.FILTER_BY_PRICE+view.SEPARATOR);
        coffee = getCoffees(coffee, CoffeePredicate.byPrice(1000.00, 2000.00));

        //Sorting by price/weight
        Collections.sort(coffee, new MultiComparator<>(
                new OrderedComparator<>(CoffeeComparator.PRICE_WEIGHT, OrderedComparator.Order.DESC)
        ));
        view.printMessage(view.SEPARATOR+view.SORT_BY_PRICE_WEIGHT+view.SEPARATOR);

        //Show all list of coffee filtering and sorting, final result
        coffee.forEach(System.out::println);
    }

    private List<Coffee> getCoffees(List<Coffee> coffee, Predicate<Coffee> predicate) {
        coffee = Filter.filter(coffee, predicate);
        coffee.forEach(System.out::println);
        return coffee;
    }
}
