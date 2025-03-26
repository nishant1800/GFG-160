// Day 4 :
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/rotate-array-by-n-elements-1587115621


public class RotateArray {
    public static void rotatedArray(int arr[], int d) {
        reverse(arr, 0, arr.length-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, d-1);
    }

    public static void reverse(int arr[], int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        rotatedArray(arr, d);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
