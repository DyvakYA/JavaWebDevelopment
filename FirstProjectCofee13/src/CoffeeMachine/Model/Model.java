package CoffeeMachine.Model;

import CoffeeMachine.Controller.CoffeeTrack;
import CoffeeMachine.View;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 17.03.2016.
 */
public class Model {

    View view = new View();
    CornCoffee corn = new CornCoffee();
    JacobsCoffee jacobsCoffee = new JacobsCoffee();
    SolubleCoffee solubleCoffee = new SolubleCoffee();
    CoffeeTrack coffeeTrack = new CoffeeTrack();
    CoffeeMachine maker;
    Coffee coffee;
    List<Coffee> coffeeCollection = new ArrayList<>();

    public List<Coffee> Coffee() {

        CoffeeMaker("CornCoffee");
        CoffeeMaker("SolubleCoffee");
        CoffeeMaker("JacobsCoffee");
        CoffeeMaker("JacobsCoffee");
        CoffeeMaker("CornCoffee");
        CoffeeMaker("CornCoffee");
        CoffeeMaker("JacobsCoffee");
        CoffeeMaker("SolubleCoffee");
        CoffeeMaker("SolubleCoffee");
        CoffeeMaker("JacobsCoffee");

        view.printMessage(view.SEPARATOR +
                view.COMMON_LIST +
                view.SEPARATOR);

        coffeeCollection.forEach(System.out::println);
        return coffeeCollection;
    }

    private void CoffeeMaker(String coffeeType) {
        maker = getCoffeeByCoffeeTypeWeightPrice(coffeeType);
        coffee = maker.loadCoffee();

        checkPriceAndWeight();
    }

    private void checkPriceAndWeight() {

        double priceValue = coffeeTrack.getTotalPrice() + coffee.getPrice();
        double weightValue = coffeeTrack.getTotalWeight() + coffee.getWeight();

        if (priceValue < coffeeTrack.getPriceLimit()) {
            if(weightValue < coffeeTrack.getWeightLimit()) {
                coffeeCollection.add(coffee);
                coffeeTrack.setTotalPrice(priceValue);
                coffeeTrack.setTotalWeight(weightValue);
            }else{
                view.printMessage(view.SEPARATOR +
                        view.TOTAL_WEIGHT_LIMIT +
                        coffeeTrack.getWeightLimit() +
                        " "+
                        view.NOW_YOU_GOT +
                        coffeeTrack.getTotalWeight()+view.SEPARATOR);
            }
       }else{
           view.printMessage(view.SEPARATOR +
                   view.TOTAL_PRICE_LIMIT +
                   coffeeTrack.getPriceLimit() +
                   " "+
                   view.NOW_YOU_GOT +
                   coffeeTrack.getTotalPrice()+view.SEPARATOR);
       }
    }

    // The Program logic
    public CoffeeMachine getCoffeeByCoffeeTypeWeightPrice(String maker) {

        if(maker.equals(corn.getCoffeeType())) {
            return new CornCoffeeLoader();
        }
        else if (maker.equals(solubleCoffee.getCoffeeType())){
            return new SolubleCoffeeLoader();
        }
        else if (maker.equals(jacobsCoffee.getCoffeeType())){
            return new JacobsCoffeeLoader();
        }
        throw new RuntimeException(view.UNSUPPORTED + maker);
    }
}





