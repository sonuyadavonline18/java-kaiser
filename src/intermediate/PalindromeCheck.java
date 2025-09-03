package intermediate;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            sc.close();

            int original = num;
            int reversed = 0;

            // Reverse the number
            while (num != 0) {
                int digit = num % 10;    // Get last digit
                reversed = reversed * 10 + digit;
                num = num / 10;          // Remove last digit
            }

            // Check if original and reversed are same
            if (original == reversed) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        }
    }
