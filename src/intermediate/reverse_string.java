package intermediate;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string (name):");
       String name = input.nextLine();

       StringBuilder sb = new StringBuilder(name);
       String rev = sb.reverse().toString();
        System.out.println("reversed :" + rev);
        input.close();

    }
}
