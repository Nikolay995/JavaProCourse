package xml_json.json_parsing.person_example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Person person = FromJSON.loadFromJSON(new File("example.json"));
        System.out.println(person.toString());
    }
}
