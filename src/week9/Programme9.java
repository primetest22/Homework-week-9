package week9;
//Create a HashMap object called people that will store String keys and Integer values:
//        And use for each loop to iterate the value from Map.

import java.util.HashMap;
import java.util.Map;

public class Programme9 {

    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Sachin", 1);
        people.put("Sehwag", 2);
        people.put("Dhoni", 3);

        for (Map.Entry<String, Integer> data : people.entrySet()) {
            System.out.println(data.getValue());


        }


    }
}
