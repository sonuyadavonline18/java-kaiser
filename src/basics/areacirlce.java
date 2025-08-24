package basics;

import java.util.Scanner;

public class areacirlce {
    public static void main(String[] args) {   // psvm in jdk
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius:");
        double radius = input.nextDouble();
       double area;
        area = Math.PI* Math.pow(radius,2);
        System.out.println("area of circle is :"+ area);
      input.close();

    }

}
