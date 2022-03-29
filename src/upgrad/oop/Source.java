package upgrad.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] strNums1, strNums2;
    	strNums1 = br.readLine().split("\\s");
    	strNums2 = br.readLine().split("\\s");
    	String input = br.readLine();
    
    	Report r1 = new Report(strNums1[0],strNums1[1],strNums1[2],strNums1[3],strNums1[4]);
    	Bus b1 = new Bus(strNums1[0],strNums1[1],strNums1[2],strNums1[5],strNums1[6]);
    	
    	
    
    	Report r2 = new Report(strNums2[0],strNums2[1],strNums2[2],strNums2[3],strNums2[4]);
    	Bus b2 = new Bus(strNums2[0],strNums2[1],strNums2[2],strNums2[5],strNums2[6]);
    	
    	if(input.equalsIgnoreCase("2")){
    		System.out.println(r2.getName() +" "+r2.getPercentage()+" "+b2.getRouteNumber());
    	}else if(input.equalsIgnoreCase("1")){
    		System.out.println(r1.getName() +" "+r1.getPercentage()+" "+b1.getRouteNumber());
    	}else{
    		System.out.println("No entry found");
    	}
    	
	}

}
