package by.tamp.module3.hierarhy;

public class DoubleCar extends Car {
    private Wings wings;

    public DoubleCar(String model, int price, int fuelConsumption, double weight) {
        super(model, price, fuelConsumption, weight);
        //wings = new Wings("blue", 5);
    }

    public Wings getWings() {
        return wings;
    }

    public boolean fly(Wings wings) {
        if(wings != null) {
            System.out.println("You are flying!");
            return true;
        } else
            System.out.println("You haven't wings! Find it!");
            return false;
    }
}
