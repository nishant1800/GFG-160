// Day 1 : Second Largest
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735

class Day1 {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int largest = -1;
        int secondLargest = -1;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }
}