package by.tamp.module3.hierarhy;

import java.text.NumberFormat;
import java.util.Locale;

public class Car implements ICar {

    private String model;
    private int price;
    private int fuelConsumption;
    private double weight;

    NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);

    public Car(String model, int price, int fuelConsumption, double weight) {
        this.model = model;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.weight = weight;
    }

    public Car(String model, int price, int fuelConsumption) {
        this.model = model;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel(){
        return model;
}

    public int getPrice() {
        return price;
    }

    public int getFuelConsumption(){
        return fuelConsumption;
    }

    public String getInfo() {
        return "Model: " + this.getModel() + "\nPrice: " +
                this.getPrice() + "$" + "\nFuel Consumption: " + this.getFuelConsumption();
    }

    @Override
    public void start(){
        System.out.println("Car is started");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }

//    @Override
//    public String toString() {
//        return this.getModel() + this.getPrice() + this.getFuelConsumption();
//    }

    @Override
    public String toString() {
        return this.getModel() + " " + formatter.format(this.getPrice()) + " " + this.getFuelConsumption() + "L";
    }
}
