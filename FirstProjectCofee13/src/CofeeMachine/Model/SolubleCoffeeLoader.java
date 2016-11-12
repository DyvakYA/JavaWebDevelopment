package CofeeMachine.Model;

/**
 * Created by Dyvak on 12.11.2016.
 */
class SolubleCoffeeLoader implements CoffeeMachine {
    public Coffee loadCoffee() {
        return new SolubleCoffee();
    }
}
