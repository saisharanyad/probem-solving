package strings;

import java.util.HashMap;
import java.util.Map;

public class StringInaPattern {
	
	
	public static void stringPattern() {
		StringBuilder builder = new StringBuilder();
		String s1 = "\nG";
		String s2 =  "\n\so";
		String s3 = "\s\so";
		
		String s4 = "\sg";
		String s5 = "\s\sl";
		
		builder.append(s3).append(s2).append(s4).append(s1).append(s5);
		
		System.out.print(builder+"\n");
	}
	
	
	public static void main(String args[]) {
		StringInaPattern.stringPattern();
		
		String s = "v";
		String s2 = "V";
		if(s == s2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		if(s.equals(s2)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("v","small");
		map.put("V","caps");
		
		System.out.println(map.get("v"));
		
	}

}
