package web.model;

public class Car {

   private String carModel;
   private int speed;
   private int carCoast;

    public Car(String modelOfCar, int speed, int carCoast) {
        this.carModel = modelOfCar;
        this.speed = speed;
        this.carCoast = carCoast;
    }

    public String getModelOfCar() {
        return carModel;
    }

    public void setModelOfCar(String modelOfCar) {
        this.carModel = modelOfCar;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCarCoast() {
        return carCoast;
    }

    public void setCarCoast(int carCoast) {
        this.carCoast = carCoast;
    }
}
