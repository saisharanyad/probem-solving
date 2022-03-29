package strings;

import java.util.TreeSet;

public class StringAppendEx {
	
	
	public static void appendString(String str) {
		int length = str.length();
		String Str;
		for(int i =0;i<length;i++) {
			 Str = str + 'a';
			System.out.println("PRINT "+Str+"==="+str);
		}
	}
	
	public static void main(String args[]) {
		StringAppendEx.appendString("poll");
		
		TreeSet<String> setstring = new TreeSet<String>();
		setstring.add("hello");
		setstring.add("abc");
		
		System.out.println(setstring);
		
	}

}
