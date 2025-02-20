// Day 2 :
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751

public class MoveAllZerosToEnd {
    public static void pushZerosToEnd(int arr[]) {
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }

    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}