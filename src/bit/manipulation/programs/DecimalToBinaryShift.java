package bit.manipulation.programs;

public class DecimalToBinaryShift {
	
	public static void main(String args[]){
		int n = 32;
		
		/**System.out.println(n >>= 1);
		System.out.println(n >>= 1);
		System.out.println(n >>= 1);
		System.out.println(n >>= 1);
		System.out.println(n >>= 1);
		System.out.println(n >>= 1);
		System.out.println(n >>= 1);**/
		
		int rem = -1;
		StringBuffer s = new StringBuffer();
		while(n > 0){
			rem = n%2;
			n >>= 1;
			s.append(rem);
		}
		System.out.println(s.reverse().toString());
		System.out.println(s.length());
	}

}
