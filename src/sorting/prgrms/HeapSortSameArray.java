package sorting.prgrms;

public class HeapSortSameArray {
	
	
	public static void heapSort(int[] arr,int n) {
		
		if(n <= 1 ) return;
		int size;
		
		/**for(size = 1;size<n;size++) {
			int i=size;
		
			while(i<=size && i!=0 && heapifyUpMax(i,arr)) {
				int pI = (i-1)/2;
				int tmp = arr[pI];
				arr[pI] = arr[i];
				arr[i] = tmp;
				i = pI;
			}
		}**/
		
		size = n-1;
		for(int i = n-1;i>=0;i--) {
			
			if(heapPropertyDownFail(i,arr,size)) {
				int cI = findMaxChildIndex(i,arr,size);
				int tmp = arr[i];
				arr[i] = arr[cI];
				arr[cI] = tmp;
			}
		}
		
		System.out.println("After heapify up");
		
		for(int element : arr) {
			System.out.print(element+";");
		}
		System.out.println("\n");
		
		int size1;
		for(size1=n-1;size1>0;size1--) {
			int i = 0;
			int tmp = arr[size1];
			arr[size1] = arr[i];
			arr[i] = tmp;
			
			while(i<size1 && size1!=1 && heapifyDownMax(i,arr,size1)) {
				int cI = findMaxCI(i,arr,size1);
				int tmp1 = arr[cI];
				arr[cI] = arr[i];
				arr[i] = tmp1;
				i = cI;
			}
		}
		
		System.out.println("After heapify down -- sorted array");
		
	}
	
	private static boolean heapifyUpMax(int i,int[] arr) {
		int pI = (i-1)/2;
		return (arr[i] > arr[pI]);
		
	}
	
	private static boolean heapifyDownMax(int i,int[] arr,int size) {
		int ciOne = (2*i)+1;
		int ciTwo = (2*i)+2;
		
		if(ciOne < size) {
			if(ciTwo < size) {
				return ((arr[i] < arr[ciOne]) || (arr[i] < arr[ciTwo]));
			}else {
				return (arr[i] < arr[ciOne]);
			}
		}
		
		return false;
	}
	
	private static int findMaxCI(int i,int[] arr,int size) {
		int ciOne = (2*i)+1;
		int ciTwo = (2*i)+2;
		

		if(ciOne < size){
			if(ciTwo < size){
				 int max = Math.max(arr[ciOne], arr[ciTwo]);
				 if(arr[ciOne] == max){
					return ciOne;
				 }else{
					return ciTwo;
				 }
			}else{
					return ciOne;
				}
			}
		
		
		return -1;
	}
	
	private static boolean heapPropertyDownFail(int i,int[] arr,int size) {
		
		int ciOne = (2*i)+1;
		int ciTwo = (2*i)+2;
		
		if(ciOne <= size) {
			if(ciTwo <= size) {
				return ((arr[i] < arr[ciOne]) || (arr[i] < arr[ciTwo]));
			}else {
				return (arr[i] < arr[ciOne]);
			}
		}
		
		return false;
	}
	
	private static int findMaxChildIndex(int i,int[] arr,int size) {
		
		int ciOne = (2*i)+1;
		int ciTwo = (2*i)+2;
		

		if(ciOne <= size){
			if(ciTwo <= size){
				 int max = Math.max(arr[ciOne], arr[ciTwo]);
				 if(arr[ciOne] == max){
					return ciOne;
				 }else{
					return ciTwo;
				 }
			}else{
					return ciOne;
				}
			}
		
		return -1;
	}
	
	public static void main(String args[]) {
		int arr[] = {20,12,6,50,4,9};
		heapSort(arr,arr.length);
		
		System.out.println("\n");
		for(int element : arr) {
			System.out.print(element+";");
		}
	}

}
