package bit.manipulation.programs;

public class OddOccuringElementXOR {
	
	private static int helper(int[] arr) {
        int res = 0;
        for (int value : arr) {
            res ^= value;
            System.out.println(res);
        }
        return res;
    }
    
    public static void main(String[] args) {
        int result = helper(new int[]{4, 3, 3, 4, 4, 4, 5, 3, 5});
        System.out.println("Odd occurring element is " + result);
    }
}
