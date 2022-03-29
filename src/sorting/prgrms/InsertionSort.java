package sorting.prgrms;

public class InsertionSort {
	
	
	public static void insertionSort(int[] arr,int n) {
		
		for(int i = 1;i<n;i++) {
			int right = arr[i];
			int leftIndex = i-1;
			
			while(leftIndex >= 0 && arr[leftIndex] > right) {
				arr[leftIndex + 1] = arr[leftIndex];
				leftIndex = leftIndex - 1;
			}
			
			arr[leftIndex+1] = right;
			
		}
	}
	
	
public static void insertionSortRecursion(int[] arr,int n) {
		
			if(n <= 1) {
				return;
			}
			insertionSortRecursion(arr,n-1);
			int right = arr[n-1];
			int leftIndex = n-2;
			
			while(leftIndex >= 0 && arr[leftIndex] > right) {
				arr[leftIndex + 1] = arr[leftIndex];
				leftIndex = leftIndex - 1;
			}
			
			arr[leftIndex+1] = right;
			
	}
	
	public static void main(String args[]) {
		int[] arr = {-987,567,4,1,-9,0};
		
		for(int element : arr) {
			System.out.print(element+",");
		}
		System.out.println("\n");
		//insertionSort(arr,arr.length);
		insertionSortRecursion(arr,arr.length);
		
		for(int element : arr) {
			System.out.print(element+",");
		}
		
	}

}
