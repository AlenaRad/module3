package by.tamp.module3.runner;

import by.tamp.module3.menu.Menu;
import by.tamp.module3.taxiCompany.TaxiCompany;

/**
 * Created by alena on 1/10/17.
 */
public class Runner {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.runMenu(new TaxiCompany());
    }
}