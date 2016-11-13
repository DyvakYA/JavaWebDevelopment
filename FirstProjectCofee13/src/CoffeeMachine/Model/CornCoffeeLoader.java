package CoffeeMachine.Model;

/**
 * Created by Dyvak on 12.11.2016.
 */
class CornCoffeeLoader implements CoffeeMachine {
    public Coffee loadCoffee() {
        return new CornCoffee();
    }
}