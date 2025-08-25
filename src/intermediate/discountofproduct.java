package intermediate;

import java.util.Scanner;

public class discountofproduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // user inputs the original price and discount percentage
        System.out.println("enter the original price :");
        double cost = sc.nextDouble();
        System.out.println("enter the discount percentage");
        double disc =sc.nextDouble();
         // calculation of discount amount
        double amount = cost * disc /100 ;
        System.out.println(" Discount amount = " + amount);
        double finalcost  = cost - amount ;
        System.out.println("final amount after dicount = " + finalcost);
      sc.close();
    }
}
