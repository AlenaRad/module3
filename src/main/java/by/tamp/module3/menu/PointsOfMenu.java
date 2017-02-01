package by.tamp.module3.menu;

import java.util.ArrayList;
import java.util.List;

public class PointsOfMenu {

    public static String FIRST_FL = "Calculate the cost of taxi company.";
    public static String SECOND_FL = "Sort car by fuel consumption.";
    public static String THIRD_FL = "Find car by parameters";


    public static String FIRST_SL_OF_SP = "Sort Family Car";
    public static String SECOND_SL_OF_SP = "Sort Double Car";
    public static String THIRD_SL_OF_SP = "Sort Single Car";

    public static String FIRST_SL_OF_TP = "Find car(s) by Model";
    public static String SECOND_SL_OF_TP = "Find car(s) by Price";
    public static String THIRD_SL_OF_TP = "Find car(s) by Fuel Consumption";
    public static String FORTH_SL_OF_TP = "Find car(s) by Price and Fuel Consumption";
    public static String FIFTH_SL_OF_TP = "Find car(s) by Model and Price";

    public static List<String> getFirstLevelPoints() {
        ArrayList<String> list = new ArrayList();
        list.add(FIRST_FL);
        list.add(SECOND_FL);
        list.add(THIRD_FL);
        return list;
    }

    public static List<String> getSecondLevelOfSecondPoint() {
        ArrayList<String> list = new ArrayList();
        list.add(FIRST_SL_OF_SP);
        list.add(SECOND_SL_OF_SP);
        list.add(THIRD_SL_OF_SP);
        return list;
    }

    public static List<String> getSecondLevelOfThirdPoint() {
        ArrayList<String> list = new ArrayList();
        list.add(FIRST_SL_OF_TP);
        list.add(SECOND_SL_OF_TP);
        list.add(THIRD_SL_OF_TP);
        list.add(FORTH_SL_OF_TP);
        list.add(FIFTH_SL_OF_TP);
        return list;
    }
}
