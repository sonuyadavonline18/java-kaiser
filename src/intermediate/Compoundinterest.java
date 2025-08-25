package intermediate;

import java.util.Scanner;

public class Compoundinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // enter the rate ,time, principal
        System.out.println("enter the rate :");
        double r = sc.nextDouble();

        System.out.println("enter the principal:");
        double p = sc.nextDouble();

        System.out.println("enter the time :");
        double t = sc.nextDouble();
        // formula to calculate amount and compound interest
        double amount = p * Math.pow(1 + r/100,t);
        double ci = amount - p;
        System.out.println("compoud interest =" + ci);
        sc.close();
    }
}
