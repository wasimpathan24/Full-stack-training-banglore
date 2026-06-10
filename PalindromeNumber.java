// A palindrome number is a number that reads the same forward and backward.
//  Examples: 121, 1331, 12321


import java.util.*;

public class PalindromeNumber {

	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        int original = n;
        int reversed = 0;

        while (n> 0) {
            int digit = n % 10;                // last digit nikalna
            reversed = reversed * 10 + digit; // reverse build karna
            n = n/ 10;                       // last digit remove karna
        }

        if (original == reversed) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is NOT Palindrome");
        }

    }
}