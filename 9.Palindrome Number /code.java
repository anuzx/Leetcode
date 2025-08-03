import java.util.Scanner;

class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int original = x;
        int r, rev = 0;

        while (x > 0) {
            r = x % 10;
            rev = rev * 10 + r;
            x = x / 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();

        boolean result = isPalindrome(x);
        System.out.println("Is Palindrome? " + result);
    }
}
