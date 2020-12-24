package Algorithms.Sorting;

public class QuickSort {
	public int[] sort(int[] arr) {
		int[] sortedArr = arr.clone();
		sort(arr, 0, arr.length-1);

		return sortedArr;
	}
	
	private void sort(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
			
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}
	
	private int partition(int[] arr, int low, int high) {
		int pivot = arr[high], i = low-1, temp;
				
		for(int j = low; j < high; j++) {
			if(arr[j] < pivot) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
}
