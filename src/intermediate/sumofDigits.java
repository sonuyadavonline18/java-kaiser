package intermediate;

import java.util.Scanner;

public class sumofDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //step 1: input a number
        System.out.println("enter a number of whatever digits");

        // step 2 : extract the last digits
        int temp = in.nextInt();
       int sum = 0;
        while(temp > 0){
            int d = temp % 10;
            sum += d;  // sum = sum + d; it calculates where the first sum is 0 which is why we assigned it
            temp /= 10;

        }

        System.out.println(sum);
    }
}
