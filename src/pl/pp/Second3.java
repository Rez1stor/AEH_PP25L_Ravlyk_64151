package pl.pp;

import java.util.Scanner;

public class Second3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        int AgeSec = age * 365 * 24 * 3600;

        System.out.println("Your age in seconds - " + AgeSec);

        scanner.close();
    }
}
