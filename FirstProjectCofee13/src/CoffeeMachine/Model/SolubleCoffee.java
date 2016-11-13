package CoffeeMachine.Model;

/**
 * Created by Dyvak on 12.11.2016.
 */
class SolubleCoffee extends Coffee {

    private long id = nextId++;
    private String coffeeType = "SolubleCoffee";
    private String pack = "pack";
    private double weight = 500.00;
    private double price = 1500.00;

    public String getCoffeeType() {
        return coffeeType;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public double getWeight() {
        return weight;
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
                '}';
    }
}

