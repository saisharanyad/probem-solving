package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//All BF ways for generating substrings
//Generate all substrings BruteForce
public class GenerateAllSubStrings {
	
	
	public static void generateAllSubstrings(String text) {
		
		for(int i=0;i<text.length();i++) {
			String substring = "";
			for(int j=i;j<text.length();j++) {
				
				substring = substring + text.charAt(j);
				System.out.println(substring);
				
				
			}
		}
	}
	
	
	public static void mostRepeatedSubString(String text) {
		
		for(int i=0;i<text.length();i++) {
			String substring = "";
			for(int j=i;j<text.length();j++) {
				
				substring = substring + text.charAt(j);
				System.out.println(substring);
				
				
			}
		}
	}
	
	
public static TreeMap<Integer,String> shortestSubStringWithControlSet(String text,
		List<Character> controlSet) {
		
		TreeMap<Integer,String> result = new TreeMap<>();
		int maxCount = controlSet.size();
		for(int i=0;i<text.length();i++) {
			String substring = "";
			for(int j=i;j<text.length();j++) {
				int count = 0;
				substring = substring + text.charAt(j);
				//System.out.println(substring);
				for(int k=0;k<substring.length();k++) {
					if(controlSet.contains(substring.charAt(k))) {
						count = count + 1;
					}
				}
				
				if(count >= maxCount) {
					result.put(substring.length(),substring);
				}
				
			}
		}
		
		return result;
	}
	
	
	public static void main(String args[]) {
		//generateAllSubstrings("helloworld");
		List<Character> list = new ArrayList<Character>();
		list.add('l');
		list.add('r');
		list.add('w');
		TreeMap<Integer,String> result=shortestSubStringWithControlSet("helloworld",list);
		for(Entry<Integer,String> entry : result.entrySet()) {
			System.out.println(entry.getKey()+"=="+entry.getValue());
		}
		
	}

}
