package strings;

public class KMPAlgorithm {
	
	//TC: Array construction: O(m)   Search:O(n+m)
	public static void KMPSearch(String input,String substringtext) {
		int[] arr = new int[substringtext.length()];
		constructArray(arr,substringtext);
		
		int i = 0; int j = 0;
		while(j<substringtext.length() && i<input.length()) {
			if(input.charAt(i) == substringtext.charAt(j)) {
				j = j+1;
				i = i+1;
			}else {
				if(j == 0) {
					i = i+1;	
				}else {
					j = arr[j-1];
				}
			}
		}
		
		if(j == substringtext.length()) {
			System.out.println("substring "+substringtext+" found");
		}
		
	}
	
	
	private static void constructArray(int[] tempArray,String substringtext) {
		int i = 1; int j = 0;
		tempArray[0] = j;
		while(i<substringtext.length()) {
			if(substringtext.charAt(i) == substringtext.charAt(j)) {
				tempArray[i] = j+1;
				j = j+1;
				i = i+1;
			}else {
				if(j == 0) {
					i = i+1;
				}else {
					j = tempArray[j-1];
				}
			}
		}
	
	}
	
	public static void main(String args[]) {
		String input = "hfdsuytnlmcd";
		String substringtext = "uyt";
		KMPSearch(input,substringtext);
	}

}
