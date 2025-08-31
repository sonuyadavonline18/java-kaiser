package intermediate;

import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input a number
        System.out.println("input a number:");
        int num = input.nextInt();

        // initialize the sum
        int sum = 0;


        // to find the factors and the sum
        for (int i = 1; i <num; i++) {   // here we use i < num that exlcudes the no itself
            if (num % i == 0) {  // checks the divisior
                sum += i;  // adds the sum with the factors
            }
        }
       // check if the sum = num and then prints accordingly
        if (sum == num) {
            System.out.println(num + " is a perfect number ");
        } else {
            System.out.println(num + " is not a perfect number");
        }
        input.close();
    }

    }



