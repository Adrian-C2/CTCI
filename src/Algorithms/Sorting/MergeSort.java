package Algorithms.Sorting;

public class MergeSort {
    public int[] sort(int[] arr) {
        int[] sortedArr = arr.clone();
        sort(sortedArr, 0, sortedArr.length-1);

        return sortedArr;
	}
	
	private void sort(int[] arr, int left, int right) {
		if(left < right) {
			int middle = (left+right)/2;
			
			sort(arr, left, middle);
			sort(arr, middle+1, right);
			
			merge(arr, left, middle, right);
		}
	}
    
    private void merge(int[] arr, int left, int middle, int right) {
        int leftSide[] = getSubarray(arr, left, middle - left + 1);
        int rightSide[] = getSubarray(arr, middle+1, right - middle);
      
        int i = 0, j = 0, k = left;
        
        while(i < leftSide.length && j < rightSide.length) {
            if (leftSide[i] <= rightSide[j]) { 
                arr[k] = leftSide[i]; 
                i++; 
            } 
            else { 
                arr[k] = rightSide[j]; 
                j++; 
            } 
            
            k++; 
        } 
  
        while(i < leftSide.length) { 
            arr[k] = leftSide[i]; 
            i++; 
            k++; 
        } 
  
        while(j < rightSide.length) { 
            arr[k] = rightSide[j]; 
            j++; 
            k++; 
        } 
	}
    
    private int[] getSubarray(int[] arr, int start, int length) {
		int[] copy = new int[length];
		
		for(int i=0; i < length; ++i)
			copy[i] = arr[start + i]; 
				
		return copy;
	}
}
