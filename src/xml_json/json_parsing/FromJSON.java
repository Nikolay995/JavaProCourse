package xml_json.json_parsing;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FromJSON {

    public static Person loadFromJSON(File file) {

        Gson gson = new Gson();

        Person person = null;

        try {
            person = gson.fromJson(new FileReader(file), Person.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return person;

    }
}
