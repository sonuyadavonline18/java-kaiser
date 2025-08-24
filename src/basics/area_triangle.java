package basics;

import java.util.Scanner;

public class area_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         //enters the height and base from the user
        System.out.println("Enter the height:");
        double  height = input.nextDouble();

        System.out.println("Enter the base:");
        double base = input.nextDouble();

        double  area = 0.5* base * height;
        System.out.println("area of triangle is :" + area);
        input.close();


    }

}
