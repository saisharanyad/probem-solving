package bit.manipulation.programs;

public class BinaryToDecimal {
	
	public static void main(String args[]){
		int binary = 111;
		int index = 0;
		int decimal = 0;
		
		while(true){
			if(binary == 0){
				break;
			}else{
				int rem = binary%10;
				if(rem == 1){
					decimal = decimal + (1 << index);
				}
				binary = binary/10;
				index++;
				
				
			}
		}
		System.out.println(decimal);
		
	}

}
