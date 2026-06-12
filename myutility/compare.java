package myutility;

public class Compare {

    public int compareTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    public int compareThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public int compareFour(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }
}