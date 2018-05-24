package xml_json.json_parsing.currencies;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Service {

     static String performRequest(String urlAddress) throws IOException {
        String result ="";
        try {
            URL url = new URL(urlAddress);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            try(BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String temp = "";
                for (; (temp = br.readLine()) != null;) {
                    result+=temp;
                    result+=System.lineSeparator();
                }
            }
        } catch (IOException e) {
            throw e;
        }
        return result;
    }

    static String readInput(){
        return new Scanner(System.in).next();
    }

    static boolean isValidInput(String input){
         return true;
    }
}
