package by.tamp.module3.menu;

import by.tamp.module3.taxiCompany.TaxiCompany;
import java.util.List;
import java.util.Scanner;
import static by.tamp.module3.menu.PointsOfMenu.getFirstLevelPoints;

public class Menu {

    public void runMenu(TaxiCompany taxiCompany) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu:\n");
        printPoints(getFirstLevelPoints());

        while (true) {
            System.out.println("");
            int ci = inputNumberInUI(in, "Select the number of operation ('?'- List of menu points, '0'- Exit):\n", false, true);
            if (ci == 0) {
                break;
            } else {
                switch (ci) {
                    case 1:
                        TaxiCompany.costOfTC(taxiCompany.allCars);
                        break;
                    case 2:
                        taxiCompany.sort();
                        break;
                    case 3:
                        taxiCompany.find();
                        break;
                    default:
                        System.out.println("\n\nThe work of app is ended.\n\n");

                }
            }
        }
    }

    public static void printPoints(List<? extends Object> listOfPoints) {
        if (!listOfPoints.isEmpty() && listOfPoints.size() > 2) {

            for (int i = 0; i < listOfPoints.size(); i++) {
                System.out.println(i + 1 + ". " + listOfPoints.get(i));
            }
        } else System.out.println("*** Error: List of points is empty!");
    }

    public static int inputNumberInUI(Scanner in, String prompt, boolean allowEmptyValue, boolean allowZero) {
        int id = 0;
        while (true) {
            System.out.print(prompt);
            String s = in.nextLine();
            if (s.isEmpty()) {
                if (allowEmptyValue) {
                    id = -1;
                    break;
                } else {
                    System.out.println("*** Error: empty value is not allowed!");
                    continue;
                }
            }
            if (s.equals("?")) {
                printPoints(getFirstLevelPoints());
                continue;
            } else {
                if (s.equals("0")) {
                    if (allowZero) {
                        break;
                    } else {
                        System.out.println("*** Error: a null value is not allowed!");
                        continue;
                    }
                }
            }
            try {
                id = Integer.valueOf(s);
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("*** Error: entered incorrect value!");
                continue;
            }
        }
        return id;
    }
}