// Day 5 : Next Permutation
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226

class Day5 {
    void nextPermutation(int[] arr) {
        // code here
        
        int n = arr.length;
        int i = n-2;
        
        while(i >= 0 && arr[i] >= arr[i+1]) {
            i--;
        }
        
        if(i >= 0) {
            int j = n-1;
            while(j >= 0 && arr[j] <= arr[i]) {
                j--;
            }
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            rev(arr, i+1, n-1);
            
        } else {
            rev(arr, 0, n-1);
        }
    }
    
    void rev(int arr[], int i, int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
