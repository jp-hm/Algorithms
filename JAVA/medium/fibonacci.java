import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int a = 0, b = 1, c;
        while (a < num) {
            c = a + b;
            a = b;
            b = c;
        }
        if (a == num) {
            System.out.println("The number is in the Fibonacci sequence.");
        } else {
            System.out.println("The number is not in the Fibonacci sequence.");
        }
    }
}
