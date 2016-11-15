package Builder;

/**
 * Created by Dyvak on 15.11.2016.
 */
public class BuilderOne {
    public static void main(String[] args) {
        Car car = new CarBuilderOne()
                .buildMake("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(250)
                .build();
        System.out.println(car);
    }
}

enum Transmission{
    MANUAL, AUTO
}

class Car{
    String make;
    Transmission transmission;
    int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

class CarBuilderOne {
    String m = "Default";
    Transmission t = Transmission.MANUAL;
    int s = 120;

    CarBuilderOne buildMake(String m){
        this.m=m;
        return this;
    }

    CarBuilderOne buildTransmission(Transmission t){
        this.t = t;
        return this;
    }

    CarBuilderOne buildMaxSpeed(int s){
        this.s = s;
        return this;
    }

    Car build(){
       Car car = new Car();
        car.setMake(m);
        car.setTransmission(t);
        car.setMaxSpeed(s);
        return car;
    }
}