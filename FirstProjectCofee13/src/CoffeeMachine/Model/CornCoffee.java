package CoffeeMachine.Model;

/**
 * Created by Dyvak on 12.11.2016.
 */
class CornCoffee extends Coffee {
    private long id = nextId++;
    private final String coffeeType = "CornCoffee";
    private String pack = "bank";
    private double weight = 200.0;
    private double price = 1200.0;


    public long getId() {
        return id;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "CornCoffee{" +
                "id=" + id +
                ", coffeeType='" + coffeeType + '\'' +
                ", pack='" + pack + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
