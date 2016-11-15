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
class SolubleCoffee implements Coffee {

    private final String coffeeType = "SolubleCoffee";
    private String pack = "pack";
    private double weight;
    private double priceWeight;
    private double coffeeWeight = 500.00;
    private double packWeight = 20.00;
    private double price = 1500.00;


    SolubleCoffee() {
        weight = coffeeWeight+packWeight;
        priceWeight = price / coffeeWeight;
    }

    public String getCoffeeType() {
        return coffeeType;
    }


    public double getPriceWeight() {
        return priceWeight;
    }


    @Override
    public double getWeight() {
        return coffeeWeight+packWeight;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SolubleCoffee{" +
                ", coffeeType='" + coffeeType + '\'' +
                ", pack='" + pack + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", priceWeight=" + (String.format("%(.2f", priceWeight)) +
                '}';
    }
}

