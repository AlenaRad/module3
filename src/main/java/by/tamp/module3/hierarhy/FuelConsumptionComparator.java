package by.tamp.module3.hierarhy;

import java.util.Comparator;

public class FuelConsumptionComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getFuelConsumption() - o2.getFuelConsumption();
    }
}
