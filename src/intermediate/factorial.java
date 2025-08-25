package intermediate;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = input.nextInt();

        long fact = 1; // store the factorial
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }

        System.out.println("the factorial of "+ n + " is : " + fact);



          input.close();


}

}
