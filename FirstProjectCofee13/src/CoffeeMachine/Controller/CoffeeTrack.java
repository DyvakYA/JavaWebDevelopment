package CoffeeMachine.Controller;

/**
 * Created by Dyvak on 13.11.2016.
 */
public class CoffeeTrack {
    private double totalPrice = 0;
    private final double  priceLimit = 10000.0;
    private double totalWeight = 0;
    private final double weightLimit = 10000.0;

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getWeightLimit() {
        return weightLimit;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getPriceLimit() {
        return priceLimit;
    }
}
