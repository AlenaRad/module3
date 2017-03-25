package by.tamp.module3.xml;

import by.tamp.module3.hierarhy.Car;
import by.tamp.module3.xml.parser.Parser;
import by.tamp.module3.xml.parser.impl.JaxbParser;

import javax.xml.bind.JAXBException;
import java.io.File;

public class JaxbTask2 {
    public static void main(String[] args) throws JAXBException {
        Parser parser = new JaxbParser();
        File file = new File("/Users/alena/Documents/projects/other/TaxiCompany/src/main/java/by/tamp/module3/xml/car2.xml");
        Car car = new Car();
        car.setModel("Mazda");
        car.setPrice(129988);
        car.setFuelConsumption(4);
        parser.saveObject(file, car);
    }
}
