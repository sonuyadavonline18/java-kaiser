package intermediate;

import java.util.Scanner;

public class Armstorngnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // step1: input a number
        System.out.println("enter a number: ");
        int n = in.nextInt();

        //step2: count the digits
        int temp = n;
        int digits = 0;
        while(temp > 0){
            temp /= 10;
            digits++;

        }
             // step 3 : calculate the sum
        temp = n;
        int sum = 0;
        while(temp > 0) {
            int d = temp % 10;
            sum += (int) Math.pow(d, digits);
            temp /= 10;
        }
        // step 4: we will compare the value of sum with the original value n
           if (sum == n){
               System.out.println(sum + " is a armstrong number");

           }
          else {
               System.out.println(n + " is not a armstrong number");
           }
           in.close();
        }


    }

