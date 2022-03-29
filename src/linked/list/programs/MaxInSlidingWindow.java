package linked.list.programs;

import java.util.LinkedList;
import java.util.TreeSet;

public class MaxInSlidingWindow {
	
	public static void main(String args[]) {
		int w = 3;
		int[] arr = {1,3,-1,-3,5,3,6,7};
		 TreeSet<Integer> set = new TreeSet<Integer>();
		    LinkedList<Integer> list = new LinkedList<Integer>();
		   
		    int n  = arr.length;
		    int[] result = new int[n-w+1];
		    int respointer = 0;
		    int count = 0;
		    for(int i=0;i<n;i++){
		        
		        set.add(arr[i]);
		        list.add(arr[i]);
		        count = count + 1;
		        
		        if(count == w ){
		            int max = set.last();
		            result[respointer] = max;
		            respointer = respointer+1;
		            int firstElement = list.removeFirst();
		            set.remove(firstElement);
		            count = count - 1;
		        }
		        
	}
		    
		    for(int x : result) {
		    	System.out.println(x);
		    }

}
}
