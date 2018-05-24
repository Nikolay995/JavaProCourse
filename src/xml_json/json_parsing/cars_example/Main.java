package xml_json.json_parsing.cars_example;

import com.google.gson.Gson;
import xml_json.json_parsing.person_example.FromJSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Car car = null;
        Gson gson = new Gson();
        car = gson.fromJson(new FileReader(new File("Cars.json")),Car.class);
        System.out.println(car);
    }
}

