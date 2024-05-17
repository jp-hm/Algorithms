import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a subsequence: ");
        String sub = scanner.nextLine();
        if (str.contains(sub)) {
            System.out.println("The subsequence is present in the string.");
        } else {
            System.out.println("The subsequence is not present in the string.");
        }
    }
}
