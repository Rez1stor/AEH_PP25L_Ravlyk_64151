package pl.pp;

import java.util.Scanner;

public class Second {
    public static void main(String[] args)  {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your First Name ");
//        String FirstName = scanner.nextLine();
//
//        System.out.println("Enter your Last Name ");
//        String LastName = scanner.nextLine();
//
//        scanner.close();
//
//        System.out.println(FirstName + ' ' + LastName + "U WON 1.000.000$");

        double x = 10;
        double y = 2;

        Scanner scanner = new Scanner(System.in);

        var result = x + y;
        System.out.println("x + y = " + result);

        result = x - y;
        System.out.println("x - y = " + result);

        result = x * y;
        System.out.println("x * y = " + result);

        result = x / y;
        System.out.println("x / y = " + result);

        result = x % y;
        System.out.println("x % y = " + result);

        System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter: ");

        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        System.out.println("x + y = " + (first + second));
    }
}