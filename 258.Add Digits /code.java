import java.util.*;

public class Solution {
    public static int addDigits(int num) {
        if (num == 0) return 0;
        else
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int answer = addDigits(num);

        System.out.println("Result = " + answer);
    }
}
