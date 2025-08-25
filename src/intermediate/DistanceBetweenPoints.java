package intermediate;

import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of x1 :");
        double x1 = sc.nextDouble();
        System.out.println("enter the value of x2 :");
        double x2 = sc.nextDouble();
        System.out.println("enter the value of y1 :");
        double y1= sc.nextDouble();
        System.out.println("enter the value of y2 :");
        double y2 = sc.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);
        System.out.println("distance between two points =" + distance);
        sc.close();

    }
}
