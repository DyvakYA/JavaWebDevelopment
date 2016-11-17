package Builder;

/**
 * Created by Dyvak on 15.11.2016.
 */
public class BuilderTwo {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SubaruBuilder());
        Car car = director.BuildCar();
        System.out.println(car);
    }
}

abstract class CarBuilderTwo {
    Car car;

    public void createCar() {
        car = new Car();
    }

    abstract void buildMake();

    abstract void buildTransmission();

    abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }

    class FordMondeoBuilder extends CarBuilderTwo {
        void buildMake() {
            car.setMake("Ford Mondeo");
        }

        void buildTransmission() {
            car.setTransmission(Transmission.AUTO);
        }

        void buildMaxSpeed() {
            car.setMaxSpeed(250);
        }
    }
}

class SubaruBuilder extends CarBuilderTwo {
        void buildMake() {
            car.setMake("Subaru Forester");
        }

        void buildTransmission() {
            car.setTransmission(Transmission.MANUAL);
        }

        void buildMaxSpeed() {
            car.setMaxSpeed(270);
        }
}

class Director{
        CarBuilderTwo builder;
        void setBuilder(CarBuilderTwo b){builder = b;}

        Car BuildCar(){
            builder.createCar();
            builder.buildMake();
            builder.buildTransmission();
            builder.buildMaxSpeed();
            Car car = builder.getCar();
            return car;
        }
}
