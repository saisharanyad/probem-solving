package sorting.prgrms;

public class SelectionSort {
	
	public static void selectionSort(int[] arr,int n){
		
		for(int i=0;i<n-1;i++) {
			int min = arr[i];
			int minIndex = i;
			
			for(int j=i+1;j<n;j++) {
				
				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			
			arr[minIndex] = arr[i];
			arr[i] = min;
		}
		
	}

	
	public static void main(String args[]){
		int[] arr = {176,-272,-45,269,-327,-945};
		
		/**for(int element : arr){
			System.out.print(element);
		}**/
		selectionSort(arr, arr.length);
		System.out.println("\n");
		
		for(int element : arr){
			System.out.print(element+";");
		}
		
		System.out.println("\n");
		
	}
}
