package week9;

import java.util.ArrayList;

public class Programme4 {

    public static void colour(){
        //array list created
        ArrayList<String> colours = new ArrayList();

        //added colours usign add method
        colours.add("White");
        colours.add("Pink");
        colours.add("Red");
        colours.add("Black");

        //getting arraylist elements using for-each loop
        for (String data : colours){
        System.out.println(data);
        }

    }
        public static void main(String[] args) {
        colour();
    }

        }