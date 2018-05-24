package xml_json.json_parsing.currencies;

import java.util.HashMap;
import java.util.Map;

public class Currency {
    private Map<String, Double> rates = new HashMap<>();

    public Currency() {

    }
    public Currency(Map<String, Double> rates) {

        this.rates = rates;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }


}
