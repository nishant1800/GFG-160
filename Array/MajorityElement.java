// Day 6 :
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote

public class MajorityElement {
    public static int findMajority(int arr[]) {
        int cand = 0;
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if(count == 0) {
                cand = arr[i];
            }

            if(cand == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        return cand;
    }
    
    public static void main(String args[]) {
        int arr[] = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        System.out.println(findMajority(arr));
    }
}