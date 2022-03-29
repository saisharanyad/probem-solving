package sorting.prgrms;

public class MergeSort {
	
	
	public static void mergeSort(int[] arr,int n) {
		
		int start = 0;
		int end = n-1;
		mergeSortHelper(start,end,arr);
	}
	
	
	private static void mergeSortHelper(int start,int end,int[] arr) {
		
		if(start >= end) return;
		
		int mid = start + (end-start)/2;
		
		mergeSortHelper(start,mid,arr);
		mergeSortHelper(mid+1,end,arr);
		merge(arr,start,end,mid);
	}
	
	private static void merge(int[] arr,int start,int end,int mid) {
		
		int n1 = (mid-start)+1;
		int n2 = (end-mid);
		int A1[] = new int[n1];
		int A2[] = new int[n2];
		
		
		int count1 = 0;
		for(int i=start;i<=mid;i++) {
			A1[count1] = arr[i];
			count1 = count1 + 1;
		}
		
		int count = 0;
		for(int i=mid+1;i<=end;i++) {
			A2[count] = arr[i];
			count = count + 1;
		}
		
		int p1=0;
		int p2=0; int p3=start;
		
		while(p1<n1 && p2<n2) {
			if(A1[p1] < A2[p2]) {
				arr[p3] = A1[p1];
				p1 = p1+1;
		
			}else {
				arr[p3] = A2[p2];
				p2 = p2+1;
			}
			p3 = p3+1;
		}
		
		while(p1 < n1) {
			arr[p3] = A1[p1];
			p1 = p1+1;
			p3 = p3+1;
		}
		
		while(p2 < n2) {
			arr[p3] = A2[p2];
			p2 = p2+1;
			p3 = p3+1;
		}
		
				
	}
	
	
	public static void main(String args[]) {
		int arr[] = {17,5,6,2,-90,-78,3,76,23465,-9876000};
		
		for(int element : arr) {
			System.out.print(element+";");
		}
		
		mergeSort(arr,arr.length);
		
		System.out.println("\n");
		
		for(int element : arr) {
			System.out.print(element+";");
		}

		
	}

}
