package xml_json.json_parsing.currencies;

import com.google.gson.Gson;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String request = "http://data.fixer.io/api/latest?access_key=8fc4616c91275ba5511e19bf7ed2853a&format=1";
        String response = "";
        String curr;
        double val;
        Gson gson = new Gson();
        Currency currency ;
        try {
            response = Service.performRequest(request);
            currency= gson.fromJson(response, Currency.class);
            Double baseCurrency = currency.getRates().get("UAH");

            System.out.print("Введите нужную валюту (EUR/USD/...): ");
            curr = new Scanner(System.in).next().toUpperCase();

            System.out.print("Введите сумму: ");
            Double inputValue = currency.getRates().get(curr);

            val = Double.parseDouble(new Scanner(System.in).next());
            Double res = val * (baseCurrency / inputValue);

            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println("\n"+val + " " + curr + " = "+ df.format(res) + " UAH");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
