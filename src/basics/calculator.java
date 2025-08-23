package basics;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input two numbers from user
        System.out.println("enter number1:");
        float num1 = input.nextFloat();
        System.out.println("enter number2");
        float num2 = input.nextFloat();
        System.out.println("Enter operator (+, -, *, /):");
        char operator = input.next().charAt(0);


        // using if conditons

        if (operator == '+') {
            System.out.println("result =" + (num1 + num2));
        }
        if (operator == '-') {
            System.out.println("result = " + (num1 - num2));
        }
        if (operator == '*') {
            System.out.println("result =" + (num1 * num2));
        }
        if (operator == '/') {
            if (num2 != 0) {
                System.out.println("result =" + (num1 / num2));
            } else {
                System.out.println("zero is not used for divisible in math ");

            }


        }
    }
}

