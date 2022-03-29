package strings;

public class BruteForceSubString {
	
	//TC:O(mn) or O(n)=== m:length of prefix,n:length of array
	
	public static int BFSubStringSearch(String text,String pattern) {
		
		int index = -1;
		
		for(int i = 0;i<text.length();i++) {
			index = i;
			int patternMatchCount = 0;
			boolean patternMatch = false;
			
			while(patternMatchCount < pattern.length() && 
					(text.charAt(i) == pattern.charAt(patternMatchCount))) {
				i = i+1;
				patternMatchCount = patternMatchCount+1;
				patternMatch = true;
			}
			
			
			if(patternMatchCount == pattern.length() && patternMatch) {
				return index;
			}else if(patternMatchCount < pattern.length() && patternMatch){
				//reset i for the example:: AAB and AB
				i=i-1;
				patternMatch = false;
			}
		}
		return index;
		
	}
	
	public static void main(String args[]) {
		String text = "AAAAAAB";
		String pattern = "AAB";
		int index = BFSubStringSearch(text,pattern);
		System.out.println("Substring index is::: "+index);
	}

}
