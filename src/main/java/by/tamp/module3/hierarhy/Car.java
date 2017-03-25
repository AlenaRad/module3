package by.tamp.module3.hierarhy;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "car")
@XmlType(propOrder = {"model","price", "fuelConsumption"})
public class Car implements ICar {

    public Car() {}

    private String model;
    private int price;
    private int fuelConsumption;
    private int weight;

    public Car(String model, int price, int fuelConsumption, int weight) {
        this.model = model;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.weight = weight;
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

    public double getWeight(){
        return weight;
    }

    @XmlElement
    public void setModel(String model) {
        this.model = model;
    }

    @XmlElement
    public void setPrice(int price) {
        this.price = price;
    }

    @XmlElement
    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    @Override
    public String toString() {
        return this.getModel() + " " + this.getPrice() + " " + this.getFuelConsumption() + "L";
    }
}
