// Day 6 : Majority Element 2
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote

class Day6 {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;
        int num1 = 0, num2 = 0, c1 = 0, c2 = 0;

        // Finding the two most frequent numbers using the Boyer-Moore algorithm
        for (int x : nums) {
            if (x == num1) {
                c1++;
            } else if (x == num2) {
                c2++;
            } else if (c1 == 0) {
                num1 = x;
                c1++;
            } else if (c2 == 0) {
                num2 = x;
                c2++;
            } else {
                c1--;
                c2--;
            }
        }

        // Reset the counts to check if num1 and num2 are indeed the majority
        c1 = 0;
        c2 = 0;
        for (int x : nums) {
            if (x == num1) {
                c1++;
            } else if (x == num2) {
                c2++;
            }
        }

        // Prepare the result list
        List<Integer> result = new ArrayList<>();
        if (c1 > n / 3) result.add(num1);
        if (c2 > n / 3) result.add(num2);

        // Sort the result and convert it to an array
        Collections.sort(result);

        return result;
    }
}