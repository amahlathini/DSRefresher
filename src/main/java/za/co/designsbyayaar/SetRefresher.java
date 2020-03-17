package za.co.designsbyayaar;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRefresher {

    Set<String> countryHashSet;
    public Set countryTree(){
        countryHashSet = new HashSet<String>();
        countryHashSet.add("China");
        countryHashSet.add("Germany");
        countryHashSet.add("Russia");
        countryHashSet.add("Brazil");
        countryHashSet.add("Norway");
        countryHashSet.add("South Africa");
        countryHashSet.add("Zimbabwe");
        countryHashSet.add("United States of America");
        countryHashSet.add("Cuba");
        countryHashSet.add("Spain");

        Set<String> tree = new TreeSet<String>(countryHashSet);
        tree.remove("China");
        tree.remove("Cuba");
        tree.remove("Russia");
        tree.clear();
        return tree;
    }
}