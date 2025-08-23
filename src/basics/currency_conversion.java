package basics;

import java.util.Scanner;

public class currency_conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input currency in rupees :");  // user inputs the rupees
        double rupees = input.nextDouble();    // the value is in double format
        double usd =  (rupees * 0.011);   // conversion rate rupees to usd

        // prints in format unlike println also %.2f means it prints the deicmal value upto 2 and %n new line
        System.out.printf("currency in usd = %.2f%n" ,usd );


        input.close();


    }

}
