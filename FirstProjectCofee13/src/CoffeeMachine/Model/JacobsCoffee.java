package CoffeeMachine.Model;

/**
 * Created by Dyvak on 12.11.2016.
 */
class JacobsCoffee extends Coffee {

    private long id = nextId++;
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
    public long getId() {
        return id;
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
                "id=" + id +
                ", coffeeType='" + coffeeType + '\'' +
                ", pack='" + pack + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", priceWeight=" + (String.format("%(.2f", priceWeight)) +
                '}';
    }
}
