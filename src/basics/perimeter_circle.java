package basics;

import java.util.Scanner;

public class perimeter_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius:");
        double radius = input.nextDouble();
        double perimeter = 2 * Math.PI* radius;
        System.out.println( "perimeter of circle is :" +perimeter );
        input.close();


    }
}