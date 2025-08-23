package basics;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // asks for the input one by one
        System.out.println("Enter principal (P):");
        float p = input.nextFloat();

        System.out.println("Enter Rate (R)");
        float r = input.nextInt();

        System.out.println("Enter time (T)");
        float t = input.nextInt();

        //calculate the interest using formula
        float interest = ((p*t*r)/100 );
        System.out.println("simple interest = " + interest);

    }

}
