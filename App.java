// remove duplicate no in array

public class App {
    public static int duplicate(int arr[]) {
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if(i < arr.length-1 && arr[i] == arr[i+1]) {
                continue;
            } else {
                arr[count] = arr[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        int arr[] = {1, 1, 2};
        System.out.println(duplicate(arr));
    }
}