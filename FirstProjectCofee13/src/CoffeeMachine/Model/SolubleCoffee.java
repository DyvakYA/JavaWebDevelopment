package CoffeeMachine.Model;

/**
 * Created by Dyvak on 12.11.2016.
 */
class SolubleCoffee extends Coffee {

    private long id = nextId++;
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
    public long getId() {
        return id;
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
                "id=" + id +
                ", coffeeType='" + coffeeType + '\'' +
                ", pack='" + pack + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", priceWeight=" + (String.format("%(.2f", priceWeight)) +
                '}';
    }
}

