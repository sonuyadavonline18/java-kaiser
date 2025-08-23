package basics;

import java.util.Scanner;

public class yourname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println(" Namaste " + name + " Welcome to Java");

    }
}