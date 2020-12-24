package Algorithms.Sorting;

public class InsertionSort {
    public static int[] sort(int arr[]) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            if(arr[i-1] > arr[i]) {
                for(int j = 0; j < i; j++) {
                    if(arr[j] > arr[i]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }

        return arr;
    }

    public static int[] sort2(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }

        return arr;
    }
}
