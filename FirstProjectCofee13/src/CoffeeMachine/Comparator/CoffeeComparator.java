package CoffeeMachine.Comparator;

import CoffeeMachine.Model.Coffee;

import java.util.Comparator;

/**
 * Created by Dyvak on 13.11.2016.
 */
public enum CoffeeComparator implements Comparator<Coffee> {

    PRICE_WEIGHT {
        @Override
        public int compare(Coffee a, Coffee b) {
            return Double.compare(a.getWeight(), b.getWeight());
        }
    }
}

