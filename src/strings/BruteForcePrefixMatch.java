package strings;

public class BruteForcePrefixMatch {
	
	//TC:O(m) ===> m is the length of the prefix
	
	public static boolean bruteForcePrefixMatch(String input,String prefix) {
		int i;
		for(i=0;i<prefix.length();i++) {
			
			if(input.charAt(i) == prefix.charAt(i)) {
				if(i == prefix.length()-1) {
					return true;
				}
			}else {
				break;
			}
		}
		return false;
	}
	
	
	public static void main(String args[]) {
		
		String input = "ABCDGEFJL";
		String prefix = "CAB";
		System.out.println("Prefix match ::: "+bruteForcePrefixMatch(input,prefix));
		
	}

}
