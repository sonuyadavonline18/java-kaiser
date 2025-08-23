package basics;

import java.util.Scanner;

public class greatest_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the first number:");
        float num1 = input.nextFloat();
        System.out.println("enter the second number");
        float num2 = input.nextFloat();
        if (num1 >= num2) {
            System.out.println("the greatest num is:" + num1);
        }
            else  {
                System.out.println("the greatest num is : " +num2);

            }
        }
    }

