package CofeeMachine.Model;

import CofeeMachine.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 17.03.2016.
 */
public class Model {

    View view = new View();

    public List<Coffee> Coffee() {
        List<Coffee> coffeeCollection = new ArrayList<>();

        CoffeeMachine maker = getCoffeeByCoffeeType("CornCoffee");
        Coffee coffee = maker.loadCoffee();
        coffeeCollection.add(coffee);
        //coffee.showCoffee();

        CoffeeMachine maker1 = getCoffeeByWeight("500.00");
        Coffee coffee1 = maker1.loadCoffee();
        coffeeCollection.add(coffee1);
        //coffee1.showCoffee();

        view.printMessage(view.SEPARATOR);

        coffeeCollection.forEach(System.out::println);
        return coffeeCollection;
    }

    // The Program logic
    public CoffeeMachine getCoffeeByCoffeeType(String maker) {

        switch (maker) {
            case "CornCoffee":
                return new CornCoffeeLoader();
            case "SolubleCoffee":
                return new SolubleCoffeeLoader();
            default:
                throw new RuntimeException("Unsupported type of coffee: " + maker);
        }
    }

    public CoffeeMachine getCoffeeByWeight(String maker) {

        switch (maker) {
            case "200.00":
                return new CornCoffeeLoader();
            case "500.00":
                return new SolubleCoffeeLoader();
            default:
                throw new RuntimeException("Unsupported type of coffee: " + maker);
        }
    }
}



