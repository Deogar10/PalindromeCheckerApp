/*
 *@author DEO
 * @Version 1.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        System.out.println(isPalindrome(input));
    }
}