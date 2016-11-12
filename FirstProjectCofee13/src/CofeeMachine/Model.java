package CofeeMachine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 17.03.2016.
 */
public class Model {

View view = new View();

     void Coffee(){
         List<Coffee> coffeeCollection = new ArrayList<Coffee>();

         CoffeeMachine maker = getCoffeeByName("CornCoffee");
         Coffee coffee = maker.loadCoffee();
         coffeeCollection.add(coffee);
         coffee.showCoffee();

         CoffeeMachine maker1 = getCoffeeByWeight("500.00");
         Coffee coffee1 = maker1.loadCoffee();
         coffeeCollection.add(coffee1);
         coffee1.showCoffee();

         view.printMessage(view.SEPARATOR);
         coffeeCollection.forEach(System.out::println);
    }


    // The Program logic

    public CoffeeMachine getCoffeeByName(String maker) {
        if (maker.equals("CornCoffee"))
            return new CornCoffeeLoader();
        else if (maker.equals("SolubleCoffee"))
            return new SolubleCoffeeLoader();

        throw new RuntimeException("No coffee" + maker);
    }

    public CoffeeMachine getCoffeeByWeight(String maker) {
        if (maker.equals("200.00"))
            return new CornCoffeeLoader();
        else if (maker.equals("500.00"))
            return new SolubleCoffeeLoader();

        throw new RuntimeException("No coffee" + maker);
    }
}

    //CoffeeMachine
    interface CoffeeMachine {
        Coffee loadCoffee();
    }

    class CornCoffeeLoader implements CoffeeMachine {
        public Coffee loadCoffee(){
            return new CornCoffee();
        }
    }

    class SolubleCoffeeLoader implements CoffeeMachine {
        public Coffee loadCoffee(){
            return new SolubleCoffee();
        }
    }

    //Coffee
    interface Coffee {
        void showCoffee();
    }

    class CornCoffee implements Coffee {
        String name = "CornCoffee";
        String pack = "bank";
        private double weight = 200.00;

        @Override
        public String toString() {
            return "CornCoffee{" +
                    "name='" + name + '\'' +
                    ", pack='" + pack + '\'' +
                    ", weight=" + weight +
                    '}';
        }

        public void showCoffee(){
            System.out.println(name+pack+weight);
    }
}

    class SolubleCoffee implements Coffee {
        String name = "SolubleCoffee";
        String pack = "pack";
        double weight = 500.00;

        @Override
        public String toString() {
            return "SolubleCoffee{" +
                    "name='" + name + '\'' +
                    ", pack='" + pack + '\'' +
                    ", weight=" + weight +
                    '}';
        }

        public void showCoffee(){
            System.out.println(name+pack+weight);
    }
}


