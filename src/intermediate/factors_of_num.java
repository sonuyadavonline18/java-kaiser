package intermediate;

import java.util.Scanner;

public class factors_of_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a number:");
        int num = input.nextInt();
        System.out.println("the factors of " + num +" are:");

        // to find the factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print( i + " ");
            }

        }
        input.close();
    }
}