package xml_json.json_parsing.currencies;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String request = "http://data.fixer.io/api/latest?access_key=8fc4616c91275ba5511e19bf7ed2853a&format=1";
        String response = "";

        Gson gson = new Gson();
        Currency currency = null;

        try {
            response = Service.performRequest(request);
            currency = gson.fromJson(response, Currency.class);
            Double baseCurrency = currency.getRates().get("UAH");
            String inputCurrency = Service.readInput();
            Double inputValue = currency.getRates().get(inputCurrency);

            System.out.println(baseCurrency/inputValue);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
