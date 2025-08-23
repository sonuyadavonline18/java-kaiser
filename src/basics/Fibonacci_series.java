package basics;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers (n):");
        int n = input.nextInt();

        int a = 0 , b = 1 ;
        System.out.println("Fibonacci series : "); // we printed before to make it clean

        for(int i =1 ; i<=n; i++){   // i++ stops the loop for n numbers
            System.out.print(a + " " );
            int next = a + b;
            a = b;
            b =next;
        }

            input.close();



        }
    }

