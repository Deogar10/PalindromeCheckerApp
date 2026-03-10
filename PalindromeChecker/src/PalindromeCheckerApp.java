/*
 *@author DEO
 * @Version 1.0
 */


public class PalindromeCheckerApp {

    public static boolean isPalindromeReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }


    public static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static boolean isPalindromeRecursive(String str, int left, int right) {
        if (left >= right) return true;

        if (str.charAt(left) != str.charAt(right)) return false;

        return isPalindromeRecursive(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String input = "madamimadam";


        long start1 = System.nanoTime();
        boolean result1 = isPalindromeReverse(input);
        long end1 = System.nanoTime();


        long start2 = System.nanoTime();
        boolean result2 = isPalindromeTwoPointer(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = isPalindromeRecursive(input, 0, input.length() - 1);
        long end3 = System.nanoTime();

        System.out.println("Input String: " + input);

        System.out.println("\nReverse Method Result: " + result1);
        System.out.println("Execution  Time: " + (end1 - start1) + " ns");

        System.out.println("\nTwo Pointer Method Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        System.out.println("\nRecursive Method Result: " + result3);
        System.out.println("Execution Time: " + (end3 - start3) + " ns");
    }
}