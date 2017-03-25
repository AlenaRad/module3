package by.tamp.module3.xml;

import by.tamp.module3.hierarhy.Car;
import by.tamp.module3.xml.parser.Parser;
import by.tamp.module3.xml.parser.impl.JaxbParser;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class JaxbParserTest {
    private Parser parser;
    private File file;

    @Before
    public void setUp() throws Exception {
        parser = new JaxbParser();
        file = new File("/Users/alena/Documents/projects/other/TaxiCompany/src/main/java/by/tamp/module3/xml/carTest.xml");
    }

    @Test
    public void testGetObject() throws Exception {
        Car car = (Car) parser.getObject(file, Car.class);
        System.out.println(car);
    }

    @Test
    public void testSaveObject() throws Exception {
        Car car = new Car();
        car.setModel("Mazda");
        car.setPrice(129988);
        car.setFuelConsumption(4);
        car.setWeight(1345);
        parser.saveObject(file,car);
    }
}
