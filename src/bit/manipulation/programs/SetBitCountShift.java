package bit.manipulation.programs;

public class SetBitCountShift {
	
	
	public static int setBitCount(long n){
		String ab = "";
		System.out.println(ab.equalsIgnoreCase("Y"));
		int count = 0;
		while(n > 0){
			if((n&1) == 1){
				count++;
			}
			n >>= 1;
		}
		return count;
	}

	public static void main(String args[]){
		//System.out.println(10 & 1);
		System.out.println(setBitCount(10));
	}
}
