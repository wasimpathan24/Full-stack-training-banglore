import myutility.*;
import java.util.Scanner;

public class MyNewClass {

    public static void main(String[]  ) {

        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();
        Compare cmp = new Compare();
        Digit dig = new Digit();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Compare Two Numbers");
            System.out.println("6. Compare Three Numbers");
            System.out.println("7. Compare Four Numbers");
            System.out.println("8. Sum of Digits");
            System.out.println("9. Reverse Number");
            System.out.println("10. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
			
			

            