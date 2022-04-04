package week9;

import java.util.HashSet;
import java.util.Set;

public class Programme8 {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for (int i = 1; i < 11; i++) {
            if (i == 4 || i == 7 || i == 8) {
                System.out.println("Number present : " + i);
            }

         }
    }
}
