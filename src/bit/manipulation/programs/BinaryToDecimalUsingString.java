package bit.manipulation.programs;

public class BinaryToDecimalUsingString {
	
	public static void main(String args[]){
		String binary = "1111111111111111111111111111111";
		int b = 8;
		int decimal;
		
	/**	System.out.println(  decimal =  1 << 0 );
		System.out.println(  decimal =  1 << 1 );
		System.out.println(  decimal =  1 << 2 );
		System.out.println(  decimal =  1 << 3 );
		System.out.println(  decimal =  1 << 4 );
		System.out.println(  decimal =  1 << 5 );
		System.out.println(  decimal =  1 << 6 );
		System.out.println(  decimal =  1 << 7 );**/
		
		int length = binary.length();
		int result = 0;
		for(int i = 0;i < length;i++){
			int digit = Integer.parseUnsignedInt(String.valueOf(binary.charAt(i)));
			System.out.println("digit::"+digit);
			if(digit == 1){
				 result =  result + (digit << i);
				 System.out.println(result);
			}
			
			
		}

	}

}
