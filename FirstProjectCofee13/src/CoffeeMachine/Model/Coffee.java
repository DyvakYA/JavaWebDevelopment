package CoffeeMachine.Model;

import java.io.Serializable;

/**
 * Created by Dyvak on 12.11.2016.
 */
public abstract class Coffee  implements Serializable{

    private static final long serialVersionUID = 7386683912412979589L;

    public static int nextId=-5;
    private double price;
    private double weight;
    String coffeeType;

    void showCoffee() {
        System.out.println(toString());
    }

    abstract public long getId();
    abstract public double getPrice();
    abstract public double getWeight();
    abstract public String getCoffeeType();
}
