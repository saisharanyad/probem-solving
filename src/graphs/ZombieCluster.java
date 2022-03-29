package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ZombieCluster {
	
	
	public static int zombieCluster(List<String> zombies) {
			int n = zombies.size();
	        boolean[] zomSet = new boolean[n];
	        int count = 0;
	        
	        Deque<Integer> d = new ArrayDeque<>();
	        
	        for(int i = 0; i<n; i++){
	        	System.out.println("in for"+i);
	            if(zomSet[i]) continue;
	            count++;
	            System.out.println("count"+count);
	            zomSet[i] = true;
	            d.push(i);
	            
	            while(!d.isEmpty()){
	                int zidx = d.pop();
	                System.out.println("inside while"+zidx);
	                for(int z=0; z<n ; z++){
	                	System.out.println("inner for"+z);
	                    if(!zomSet[z] && zombies.get(zidx).charAt(z)=='1'){
	                    	System.out.println("inside if"+z);
	                        zomSet[z] = true;
	                        d.push(z);
	                    }
	                }
	            }
	        }
	        return count;
	}
	
	
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("1100");
		list.add("1100");
		list.add("0000");
		list.add("0011");
		int count = zombieCluster(list);
		System.out.println(count);
	}

}
