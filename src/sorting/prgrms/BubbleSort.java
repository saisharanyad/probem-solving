package sorting.prgrms;

public class BubbleSort {
	
	
	public static void bubbleSort(int[] arr,int n){
		
		for(int i = 0; i < n-1;i++) {
			
			for(int j = n-1; j > i;j--) {
				
				if(arr[j-1] > arr[j]) {
					int tmp = arr[j];
					arr[j]  = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}
	
	}
	
	public static void main(String args[]){
		int[] arr = {9,6,1};
		bubbleSort(arr, arr.length);
		System.out.println("\n");
		
		for(int element:arr) {
			System.out.println(element);
		}
	}

}
