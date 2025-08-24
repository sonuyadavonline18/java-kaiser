package basics;

import java.util.Scanner;

public class area_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the length:");
        double l = input.nextDouble();
        System.out.println("enter the breadth");
        double b = input.nextDouble();


        double area = l * b;
        System.out.println("the area of rectangle is "+ area);
        input.close();

    }
}