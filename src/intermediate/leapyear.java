package intermediate;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter year to check :");
        int year = input.nextInt();
        // step 2 we use if else condition
        if(year % 400 == 0) {
            System.out.println(year +" is a leap year");
        }else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year");
        } else if ( year % 4 == 0) {
            System.out.println( year +" is a leap year ");
        }
        else {
            System.out.println(year +" is not a leap year ");

        }
      input.close();

    }


}
