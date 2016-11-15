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
class JacobsCoffee implements Coffee {

    private final String coffeeType = "JacobsCoffee";
    private String pack = "bank";
    private double weight;
    private double priceWeight;
    private double coffeeWeight = 300.00;
    private double packWeight = 35.00;
    private double price = 1300.0;
    

    JacobsCoffee() {
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
    public double getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return coffeeWeight+packWeight;
    }

    @Override
    public String toString() {
        return "JacobsCoffee{" +
                ", coffeeType='" + coffeeType + '\'' +
                ", pack='" + pack + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", priceWeight=" + (String.format("%(.2f", priceWeight)) +
                '}';
    }
}
