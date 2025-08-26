package intermediate;

import java.util.Scanner;

public class PowerinJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
          // to enter the base and expo by the user
        System.out.println("enter the base :");
        double base = sc.nextDouble();
        System.out.println("enter the exponent :");
        double exp = sc.nextDouble();
        double power = Math.pow(base, exp);
        System.out.println(" power in java " + power);
        sc.close();
    }
}
