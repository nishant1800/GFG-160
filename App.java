
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input array
        System.out.println("Enter the elements of the array (space separated):");
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        // Ask user for the value of k
        System.out.println("Enter the number of subarrays (k):");
        int k = scanner.nextInt();

        // Find the minimized largest sum using Binary Search
        int result = minimizeLargestSum(nums, k);

        // Print the minimized largest sum
        System.out.println("The minimized largest sum is " + result + ".");

        scanner.close();
    }

    private static int minimizeLargestSum(int[] nums, int k) {
        int left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(left, num);  // max element in array
            right += num;                // sum of all elements
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static boolean canSplit(int[] nums, int k, int maxSum) {
        int count = 1, sum = 0;
        for (int num : nums) {
            if (sum + num > maxSum) {
                count++;
                sum = num;
                if (count > k) {
                    return false;
                }
            } else {
                sum += num;
            }
        }
        return true;
    }
}
