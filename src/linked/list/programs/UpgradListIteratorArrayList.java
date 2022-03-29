package linked.list.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class UpgradListIteratorArrayList {


	   public static void main(String[] args) {
	       List<Float> random = new ArrayList<Float>();
	       random.add(2f);
	       random.add(4f);
	       random.add(5f);
	       random.add(10f);
	       random.add(99.9f);
	       random.add(101f);

	      printList(random);
	       iterateAltn(random);
	   }

	   public static void printList(List<Float> arr) {
	      /** for(Float num : arr) {
	           System.out.println(num);
	       }**/
	       
	      
	       for(int i = arr.size() - 1;i>=0;i--){
	    		System.out.println(arr.get(i));
	    	}
	      
	       	       
	}
	       
	    public static void iterateAltn(List<Float> arr){
	    	if(arr.size() > 1){
	    		for(int i = 1;i<arr.size();i++){
		    		if(i%2 != 0){
		    			System.out.println(arr.get(i));
		    		}
		    		
		    	}
	    	}
	    	
	       
	    }
}
