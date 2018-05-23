package xml_json.json_parsing;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Person person = FromJSON.loadFromJSON(new File("example.json"));
        System.out.println(person.toString());
    }
}
