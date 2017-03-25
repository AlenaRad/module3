package by.tamp.module3.taxiCompany;

import by.tamp.module3.hierarhy.*;
import java.text.NumberFormat;
import java.util.*;

import static by.tamp.module3.menu.Menu.inputNumberInUI;
import static by.tamp.module3.menu.Menu.printPoints;
import static by.tamp.module3.menu.PointsOfMenu.getSecondLevelOfSecondPoint;
import static by.tamp.module3.menu.PointsOfMenu.getSecondLevelOfThirdPoint;

public class TaxiCompany {
    public List<FamilyCar> familyCars;
    public List<DoubleCar> doubleCars;
    public List<SingleCar> singleCars;
    public List<List<? extends Car>> allCars;

    public TaxiCompany() {
        familyCars = new ArrayList<FamilyCar>();
        familyCars.add(new FamilyCar("Tesla Model X", 129800, 0, 2468));
        familyCars.add(new FamilyCar("Volkswagen Golf", 6600, 4, 1395));
        familyCars.add(new FamilyCar("Mazda 3", 19260, 5, 1219));
        familyCars.add(new FamilyCar("Hyundai Sonata", 11220, 8, 1600));
        familyCars.add(new FamilyCar("Toyota Land Cruiser", 135400, 12, 4376));
        familyCars.add(new FamilyCar("Subaru Outback", 9450, 10, 2070));
        familyCars.add(new FamilyCar("Honda CR-V", 12045, 9, 281));

        doubleCars = new ArrayList<DoubleCar>();
        doubleCars.add(new DoubleCar("Suzuki Twin", 12400, 4, 560));
        doubleCars.add(new DoubleCar("Toyota iQ", 22330, 3, 845));
        doubleCars.add(new DoubleCar("Fiat Seicento", 8200, 2, 730));
        doubleCars.add(new DoubleCar("Mazda C1", 12000, 2, 835));
        doubleCars.add(new DoubleCar("Chevrolet Spark", 11930, 1, 775));
        doubleCars.add(new DoubleCar("Toyota 107", 13500, 5, 800));
        doubleCars.add(new DoubleCar("Mercedes SMART ForTwo", 15400, 6, 730));

        singleCars = new LinkedList<SingleCar>();
        singleCars.add(new SingleCar("Mazda Mono", 16380, 1, 330));
        singleCars.add(new SingleCar("Ariel Atom", 12000, 2, 290));
        singleCars.add(new SingleCar("Peel P50", 17430, 1, 230));
        singleCars.add(new SingleCar("Volkswagen Nils", 15640, 3, 340));

        allCars = new ArrayList<List<? extends Car>>();
        allCars.add(0, familyCars);
        allCars.add(1, doubleCars);
        allCars.add(2, singleCars);
    }

    public static int costOfTC(List<List<? extends Car>> collections) {
        int sum = 0;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        for (List<? extends Car> collection : collections) {
            if (!collection.isEmpty() || collection.size() > 2) {
                int c = costOfCol(collection);
                sum += c;
            }
        }
        System.out.println("Cost of taxi company: " + formatter.format(sum));
        return sum;
    }

    private static int costOfCol(List<? extends Car> collection) {
        int sum = 0;
        if(!collection.isEmpty() || collection.size() > 2) {
            for (Car car : collection) {
                int c = car.getPrice();
                sum += c;
            }
        } else
            System.out.println("Collection empty or size less than two elements");
        return sum;
    }

    public void sort() {
        Scanner in = new Scanner(System.in);
        printPoints(getSecondLevelOfSecondPoint());
        while (true) {
            System.out.println("");
            int ci = inputNumberInUI(in, "Select the number of operation ('?'- List of menu points, '0'- Exit):\n", false, true);
            if (ci == 0) {
                break;
            } else {

                switch (ci) {
                    case 1:
                        Collections.sort(familyCars, new FuelConsumptionComparator());
                        for (int i = 0; i < familyCars.size(); i++) {
                            System.out.println(familyCars.get(i).getModel() + " : " +
                                    familyCars.get(i).getFuelConsumption());
                        } break;
                    case 2:
                        Collections.sort(doubleCars, new FuelConsumptionComparator());
                        for (int i = 0; i < doubleCars.size(); i++) {
                            System.out.println(doubleCars.get(i).getModel() + " : " +
                                    doubleCars.get(i).getFuelConsumption());
                        } break;
                    case 3:
                        Collections.sort(singleCars, new FuelConsumptionComparator());
                        for (int i = 0; i < singleCars.size(); i++) {
                            System.out.println(singleCars.get(i).getModel() + " : " +
                                    singleCars.get(i).getFuelConsumption());
                        } break;
                }
            }
        }
    }

    public void find() {
        Scanner in = new Scanner(System.in);
        printPoints(getSecondLevelOfThirdPoint());

        while (true) {
            System.out.println("");
            int ci = inputNumberInUI(in, "\n", false, true);
            if (ci == 0) {
                break;
            } else {
                switch (ci) {
                    case 1:
                        System.out.println("Enter Model: ");
                        String s = in.nextLine();
                        if (s == null) {
                            break;
                        } else {
                            for (List<? extends Car> collections : allCars) {
                                for (Car car : collections) {
                                    if (car.getModel().contains(s)) {
                                        System.out.println(car);
                                    }
                                }
                            }
                        } break;
                    case 2:
                        System.out.println("Enter Price: ");
                        String s1 = in.nextLine();
                        if (s1 == null) {
                            break;
                        } else {
                            int num = 0;
                            try {
                                num = Integer.parseInt(s1);
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                            for (List<? extends Car> collections : allCars) {
                                for (Car car : collections) {
                                    if (car.getPrice() == num) {
                                        System.out.println(car);
                                    }
                                }
                            }
                        } break;
                    case 3:
                        System.out.println("Enter Fuel Consumption: ");
                        String s2 = in.nextLine();
                        if (s2 == null) {
                            break;
                        } else {
                            int num = 0;
                            try {
                                num = Integer.parseInt(s2);
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                            for (List<? extends Car> collections : allCars) {
                                for (Car car : collections) {
                                    if (car.getFuelConsumption() == num) {
                                        System.out.println(car);
                                    }
                                }
                            }
                        } break;
                    case 4:
                        System.out.println("Enter Price: ");
                        String s3 = in.nextLine();
                        System.out.println("Enter Fuel Consumption: ");
                        String s4 = in.nextLine();
                        if (s3 == null && s4 == null) {
                            break;
                        } else {
                            int num = 0;
                            int num1 = 0;
                            try {
                                num = Integer.parseInt(s3);
                                num1 = Integer.parseInt(s4);
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                            for (List<? extends Car> collections : allCars) {
                                for (Car car : collections) {
                                    if (car.getPrice() == num && car.getFuelConsumption() == num1) {
                                        System.out.println(car);
                                    }
                                }
                            }
                        } break;
                    case 5:
                        System.out.println("Enter Model: ");
                        String s5 = in.nextLine();
                        System.out.println("Enter Price: ");
                        String s6 = in.nextLine();
                        if (s5 == null && s6 == null) {
                            break;
                        } else {
                            int num = 0;
                            try {
                                num = Integer.parseInt(s6);
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                            for (List<? extends Car> collections : allCars) {
                                for (Car car : collections) {
                                    if (car.getModel().contains(s5) && car.getPrice() == num) {
                                        System.out.println(car);
                                    }
                                }
                            }
                        } break;
                }
            }
        }
    }
}