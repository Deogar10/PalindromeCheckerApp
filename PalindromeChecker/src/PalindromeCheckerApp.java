/*
 *@author DEO
 * @Version 1.0
 */
import java.util.Scanner;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 2: Reverse the string using for loop
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Step 3: Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}