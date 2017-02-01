package by.tamp.module3.hierarhy;

public class FamilyCar extends Car {

    private WaterPillow waterPillow;

    public FamilyCar(String model, int price, int fuelConsumption, int weight) {
        super(model, price, fuelConsumption, weight);
        waterPillow = new WaterPillow(20, "green", 3);
    }

    public WaterPillow getWaterPillow() {
        return waterPillow;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nLevelOfWaterResistance: " + waterPillow.getLevelOfWaterResistance();
    }
}
