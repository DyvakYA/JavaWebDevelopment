package CoffeeMachine.Model;

import java.io.Serializable;

/**
 * Main.java
 * <p>
 * Start point of the validation.
 * Here we will start controller {@link Controller}
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 5.11.2016.
 */
public interface Coffee extends Serializable {

    abstract public double getPrice();
    abstract public double getWeight();
    abstract public String getCoffeeType();
}
