package CofeeMachine.Filter;

import CofeeMachine.Model.Coffee;
import java.util.Objects;

/**
 * Created by Dyvak on 12.11.2016.
 */
public class CoffeePredicate {

        private CoffeePredicate() {}

        public static Predicate<Coffee> byId(long id) {
            return new Predicate<Coffee>() {
                @Override
                public boolean apply(Coffee value) {
                    if (value == null) {
                        return false;
                    }
                    return value.getId() == id;
                }
            };
        }

        public static Predicate<Coffee> byCoffeeType(String coffeeType) {
            return new Predicate<Coffee>() {
                @Override
                public boolean apply(Coffee value) {
                    if (value == null) {
                        return false;
                    }
                    return Objects.equals(value.getCoffeeType(), coffeeType);
                }
            };
        }

        public static Predicate<Coffee> byWeight(double minWeight, double maxWeight) {
            return new Predicate<Coffee>() {
                @Override
                public boolean apply(Coffee value) {
                    if (value == null) {
                        return false;
                    }

                    return value.getWeight() >= minWeight && value.getWeight() <= maxWeight;
                }
            };
        }

    public static Predicate<Coffee> byPrice(double minPrice, double maxPrice) {
        return new Predicate<Coffee>() {
            @Override
            public boolean apply(Coffee value) {
                if (value == null) {
                    return false;
                }

                return value.getPrice() >= minPrice && value.getPrice() <= maxPrice;
            }
        };
    }
}

