package bit.manipulation.programs;

public class SingleNumberXOR {
	
	public static void main(String args[]){
		 int xor = 0;
		 int[] nums = {4, 1, 2, 9, 1, 4, 2};
	        for (int num : nums) {
	            xor ^= num;
	            System.out.println("op: "+xor);
	        }
	        System.out.println(xor);
	}

}
