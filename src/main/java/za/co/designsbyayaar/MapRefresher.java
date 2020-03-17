package za.co.designsbyayaar;

import java.util.HashMap;

public class MapRefresher {

    HashMap<Integer,String> area;

    public HashMap areaCode(){

        area = new HashMap<Integer,String>();
        area.put(021,"Cape Town");
        area.put(031,"Durban");
        area.put(043,"East London");
        area.put(012, "Pretoria");
        area.put(011, "Johannesburg");
        area.put(041, "Port Elizabeth");
        area.put(051, "Bloemfontein");
        area.remove(021);
        area.remove(031);
        area.put(046, "Alice");

        return area;
    }
}

