package CoffeeMachine.Model;

/**
 * Created by Dyvak on 12.11.2016.
 */
class JacobsCoffeeLoader implements CoffeeMachine {
    public Coffee loadCoffee() {
        return new JacobsCoffee();
    }
}