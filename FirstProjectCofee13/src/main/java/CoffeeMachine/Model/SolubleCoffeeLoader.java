package CoffeeMachine.Model;

/**
 * Main.java
 * <p>
 * Start point of the validation.
 * Here we will start controller {@link Controller}
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 5.11.2016.
 */
class SolubleCoffeeLoader implements AbstractMethodCoffeeMaker {
    public Coffee loadCoffee() {
        return new SolubleCoffee();
    }
}
