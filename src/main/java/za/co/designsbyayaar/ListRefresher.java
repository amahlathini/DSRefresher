package za.co.designsbyayaar;

import java.util.List;

public class ListRefresher {
    List<String> cities;

    public List cityList() {
        cities = new java.util.ArrayList<String>();
        cities.add("Tokyo");
        cities.add("Berlin");
        cities.add("Moscow");
        cities.add("Rio");
        cities.add("Oslo");
        cities.add("Cape Town");
        cities.add("Harare");
        cities.add("New York");
        cities.add("Havana");
        cities.add("Ibiza");
        cities.remove(7);
        cities.add(7,"Los Angels");



        return cities;
    }
}
