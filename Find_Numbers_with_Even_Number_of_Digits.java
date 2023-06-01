import java.util.Scanner;

public class EvenDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size and elements
        int size = scanner.nextInt();

        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Count even digits integers
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            while (num != 0) {
                num /= 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }

        // Print result
        System.out.println(count);
    }
}