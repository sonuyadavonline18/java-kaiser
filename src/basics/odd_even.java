package basics;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a num:");
        int num = input.nextInt();
        if (num % 2 == 0) {
        System.out.println("the number is even");}

       else {
                System.out.println("the number is odd");
                input.close();




            }
        }
    }

