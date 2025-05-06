// Day 3 : Reverse an Array
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array

class Day3 {
    public void reverseArray(int arr[]) {
        // code here
        
        int first = 0;
        int last = arr.length-1;
        
        while(first < last) {
            
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            
            first++;
            last--;
        }
    }
}