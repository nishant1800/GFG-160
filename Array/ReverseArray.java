// Day 3 :
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array

public class ReverseArray {
    public static void getReverseArray(int arr[]) {
        int first = 0;
        int last = arr.length-1;

        while(first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
    
    public static void main(String args[]) {
        int arr[] = {1, 4, 3, 2, 6, 5};
        getReverseArray(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}