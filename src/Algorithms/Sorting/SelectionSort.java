package Algorithms.Sorting;

public class SelectionSort {
    public static int[] sort(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int min = n-1, temp;

            for(int j = i; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }
}
