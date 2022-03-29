package sorting.prgrms;

public class QuickSort {
	
	
	public static void quickSort(int[] arr,int n) {
		
		int start = 0;
		int end = n-1;
		quickSortHelper(start,end,arr);
		
	}
	
	public static void quickSortHelper(int start,int end,int[] arr) {
	System.out.println(start+"=="+end);
		if(start >= end) return;
		int pivotIndex = choosePivot(arr,start,end);
		//int sortedPI = QSPartition.partitionBF(arr,start,end,pivotIndex);
		//int sortedPI = QSPartition.partitionLomutos1(arr,start, end, pivotIndex);
		int sortedPI = QSPartition.partitionLomutos2(arr,start, end, pivotIndex);
		//int sortedPI = QSPartition.partitionHoares(arr,start, end, pivotIndex);
		System.out.println("sortedpi=="+sortedPI);
		for(int element : arr) {
			System.out.print(element+";");
		}
		System.out.println("");
		quickSortHelper(start,sortedPI-1,arr);
		quickSortHelper(sortedPI+1,end,arr);
		
	}
	
	private static int choosePivot(int[] arr,int start,int end) {
		
		return start;
	}
	
	
	
	public static void main(String args[]) {
		int arr[] = {17,5,6,2};
		quickSort(arr,arr.length);
		
		System.out.println("\n");
		for(int element : arr) {
			System.out.print(element+";");
		}
	}

}
