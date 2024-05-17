import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by space: ");
        String[] numbers = scanner.nextLine().split(" ");
        System.out.print("Reversed list:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
    }
}
