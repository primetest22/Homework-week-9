package calculate;

import java.util.Scanner;

public class Main {
    public static void doAgain(){
        Calculator obj = new Calculator();
        Scanner number = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = number.nextInt();
        System.out.println("Enter second number");
        int number2 = number.nextInt();
        System.out.println("Please enter one of symbol + - * / : ");
        char symbol = number.next().charAt(0);
        obj.calculateResult(number1, number2, symbol);

    }
    public static void main(String[] args) {
        doAgain();

        Scanner s = new Scanner(System.in);
        System.out.println("Would you like to do more calculation Please enter " + "Y " + "or" + " N" + ":");
        char ch =s.next().charAt(0);

        while (ch == 'Y' || ch == 'y') {
         doAgain();
        }
        s.close();

    }
}
