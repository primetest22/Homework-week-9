package week9;

import java.util.ArrayList;

import java.util.Iterator;

public class Programme5 {

    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<>();
        city.add("Mumbai");
        city.add("Goa");
        city.add("Cochin");
        city.add("Munnar");

        //iterator set using iterator interface
        Iterator itr = city.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
