import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by space: ");
        String[] numbers = scanner.nextLine().split(" ");
        int[] nums = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(nums);
        System.out.print("Sorted numbers:");
        for (int num : nums) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
}
