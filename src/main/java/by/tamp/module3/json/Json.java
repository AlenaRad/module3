package by.tamp.module3.json;

import by.tamp.module3.hierarhy.Car;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.io.*;

public class Json {
    static String file1 = "/Users/alena/Documents/projects/other/TaxiCompany/src/main/java/by/tamp/module3/json/car1.json";
    static String file2 = "/Users/alena/Documents/projects/other/TaxiCompany/src/main/java/by/tamp/module3/json/car2.json";

    public static void main(String[] args) throws IOException {
        toJson();
        System.out.println("\nPretty printing JSON output:\n" + outToJson(getCar()));
        fromJson(file2);
        writeToFile(file1, getCar());
    }

    private static void toJson() throws IOException {
        Gson gson = new GsonBuilder().create();
        System.out.println("Serialization of object to json string: " + gson.toJson(getCar()));
    }

    private static void fromJson(String pathToFile){
        JsonReader jsonReader = null;
        try {
            jsonReader = new JsonReader(new FileReader(pathToFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Gson gson = new GsonBuilder().create();
        Car car = gson.fromJson(jsonReader, Car.class);
        System.out.println("\nDeserialization of object from json: " + car);
        try {
            jsonReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String outToJson(Object o) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonOutput = gson.toJson(o);
        return jsonOutput;
    }

    private static void writeToFile(String string, Car car) {
        try {
            File file = new File(string);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(outToJson(car));
            bufferedWriter.close();
            System.out.println("\nObject '" + car + "' are successfully written to " + string.substring(string.lastIndexOf("/") + 1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Car getCar() {
        Car car = new Car();
        car.setModel("Tesla Model X");
        car.setPrice(129600);
        car.setFuelConsumption(0);
        car.setWeight(2468);
        return car;
    }
}
