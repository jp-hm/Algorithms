import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by space: ");
        String[] numbers = scanner.nextLine().split(" ");
        double sum = 0;
        for (String num : numbers) {
            sum += Double.parseDouble(num);
        }
        double average = sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
