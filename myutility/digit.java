package myutility;

public class Digit {

    public int sumOfDigits(int n) {
        int sum = 0;
        n = Math.abs(n);

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}