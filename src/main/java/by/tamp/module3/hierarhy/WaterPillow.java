package by.tamp.module3.hierarhy;

public class WaterPillow extends Pillow {
    private int levelOfWaterResistance;
    private static final double maxPressure = 350;
    private static final double maxWeight = 430;

    WaterPillow(int size, String color, int levelOfWaterResistance) {
        super(size, color);
        this.levelOfWaterResistance = levelOfWaterResistance;
    }

    public int getLevelOfWaterResistance() {
        return levelOfWaterResistance;
    }

    public boolean checkInflate(double weight) {
        if (weight != 0 || (weight < maxPressure && weight > 100)) {
            double pressure = weight * maxPressure / maxWeight;
            if (pressure != 0 && pressure > 150) {
                System.out.println("Подушка готова к использованию! Приятного путешествия!");
                return true;
            } else if (pressure == 0 || pressure < 150) {
                System.out.println("Подушка надувается, подождите...");
                System.out.println("Подушка готова к использованию! Приятного путешествия!");
                return true;
            }
        }
        return false;
    }

    @Override
    public void cleanUp(String s){
        if(!s.isEmpty() && s.equals("Wash me now!")) {
            System.out.println("by.tamp.module3.Pillow is washed");
        } else {
            System.out.println("by.tamp.module3.Pillow is not washed");
        }
    }

    @Override
    public void dryUp(int c) {
        if(0 != c && c > 2) {
            System.out.println("by.tamp.module3.Pillow is dried");
        } else
            System.out.println("by.tamp.module3.Pillow is not dried");
    }

}
