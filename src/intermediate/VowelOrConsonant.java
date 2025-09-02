package intermediate;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // step 1 we will input a character
        System.out.println("enter a character:" );
         char ch = sc.next().charAt(0);  // takes the character at 0th position


        // Step 2: Convert to lowercase (so 'A' and 'a' both work)
        ch = Character.toLowerCase(ch);

        // step 3 we will use condition if else
        if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u'){
            System.out.println(" is a vowel letter ");}
            else if (ch >= 'a' && ch <= 'z'){
            System.out.println("is a consonant");

            }
           else {
            System.out.println(" is not an alphabet ");
        }





    }



}
