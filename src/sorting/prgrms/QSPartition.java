package sorting.prgrms;

public class QSPartition {
	
	public static int partitionBF(int[] arr,int start,int end,int pivotIndex) {
		
		int leCount = 0;
		int n = arr.length;
		
		for(int i = 0;i < n ; i++ ) {
			if(arr[i] < arr[pivotIndex]) {
				leCount = leCount + 1;
			}
		}
		
		int newArr[] = new int[n];
		newArr[leCount] = arr[pivotIndex];
		int ltCount = 0 ; 
		int gtCount = leCount + 1;
		
		for(int j = 0;j < n;j++) {
			if(j == leCount) continue;
			
			if(arr[j] < arr[pivotIndex]) {
				newArr[ltCount] = arr[j];
				ltCount = ltCount + 1;
			}else {
				newArr[gtCount] = arr[j];
				gtCount = gtCount + 1;
			}
		}
		
		return leCount;
	}
	
	public static int partitionLomutos1(int[] arr,int start,int end,int pivotIndex) {
		
		//pivot is arr[end]
		int big;
		int small = start;
		
		for(big = start ;big < end;big++) {
			if(arr[big] < arr[pivotIndex]) {
				int tmp = arr[big];
				arr[big] = arr[small];
				arr[small] = tmp;
				small = small + 1;
			}
		}
		int tmp = arr[pivotIndex];
		arr[pivotIndex] = arr[small];
		arr[small] = tmp;
		
		return small;
	}
	
	public static int partitionLomutos2(int[] arr,int start,int end,int pivotIndex) {
		//pivot is arr[start]
				int big;
				int small = start;
				
				for(big = start+1 ;big <= end;big++) {
					if(arr[big] < arr[pivotIndex]) {
						small = small + 1;
						int tmp = arr[big];
						arr[big] = arr[small];
						arr[small] = tmp;
						
					}
				}
				int tmp = arr[pivotIndex];
				arr[pivotIndex] = arr[small];
				arr[small] = tmp;
				
				return small;
	}
	
	public static int partitionHoares(int[] arr,int start,int end,int pivotIndex) {
		//pivot is arr[end] or arr[start]
		int small = start-1;
		int big = end+1;
		
		while(true) {
		
		do {
			small = small + 1;
		}
		while(arr[small] < arr[pivotIndex]);
		
		do {
			big = big - 1;
		}
		while(arr[big] > arr[pivotIndex]);
		
				
		if(small >= big) return big;
		
		int tmp = arr[small];
		arr[small] = arr[big];
		arr[big] = tmp;
		
	}
		
}

}
