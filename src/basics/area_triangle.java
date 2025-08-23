package basics;

import java.util.Scanner;

public class area_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         //enters the height and base from the user
        System.out.println("Enter the height:");
        float height = input.nextFloat();

        System.out.println("Enter the base:");
        float base = input.nextFloat();

        float area = (base * height) / 2;
        System.out.println(area + "");
        input.close();

        //area of rectangle
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the length:");
//        float l = sc.nextFloat();
//        System.out.println("enter the breadth :");
//        float b = sc.nextFloat();
//
//        float areaR = (l * b);
//        System.out.println(areaR + "");
//        sc.close();
    }

}
