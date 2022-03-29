package sorting.prgrms;

import java.util.LinkedHashSet;
import java.util.TreeSet;


//This is also similar to  
//1)find top k from a stream of infinite elements.
//2)find top closest points from a given point.
public class TopK {

	public static void main(String args[]) {
		int k = 3;
		int[] arr = {1,100,30,2,90,97};
		
        
        /**PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i= 0;i < arr.length; i++){
        	
        	if(set.add(arr[i]))
        	{
        		queue.offer(arr[i]);
            
        	}
        	 if(queue.size() == k+1){
                 queue.poll();
             }
           
        }
        
     
        int result[] = new int[queue.size()];
        int pointer = 0;
        while(!queue.isEmpty()) {
        	result[pointer] = queue.poll();
        	System.out.println(result[pointer]);
        	pointer = pointer + 1;
        	
        }**/
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        
        for(int x : arr){
            set.add(x);
            lhs.add(x);
            if(set.size() == k+1){
                int element = set.pollFirst();
                lhs.remove(element);
                
            }
        }
        
      /** int result[] = new int[set.size()];
        int counter = 0;
       for(int x : set){
           result[counter] = x;
           System.out.println(result[counter]);
           counter = counter + 1;
       }**/
       
      int result[] = new int[lhs.size()];
      int counter = 0;
      for(int x : lhs){
          result[counter] = x;
          System.out.println(result[counter]);
          counter = counter + 1;
      }
        
	}
}
