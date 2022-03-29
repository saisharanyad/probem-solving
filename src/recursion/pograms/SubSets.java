package recursion.pograms;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
	
	static List<String> list = new ArrayList<>();
	public static String[] generateAllSubsets(String s) {
		
		   subsetStrHelper("",s);
	        
	        String[] res = list.stream().toArray(String[] :: new);
	        return res;
	}
	
	static void subsetStrHelper(String subsetStr,String origStr){
		//System.out.println(subsetStr+"====="+origStr);
        if(origStr.isEmpty()){
            list.add(subsetStr);
            return;
        }
        
       
       String newsubsetStr = subsetStr + origStr.charAt(0);
       String neworigStr;
       if(origStr.length() == 1){
            neworigStr = "";
       }else{
             neworigStr = origStr.substring(1);
       }
      
       subsetStrHelper(newsubsetStr,neworigStr);
       subsetStrHelper(subsetStr,neworigStr);
     
    }
	
	public static void main(String args[]) {
		String[] res = generateAllSubsets("ab");
		for(String x : res) {
			System.out.println("response==="+x);
		}
	}

}
