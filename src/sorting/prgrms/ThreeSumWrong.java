package sorting.prgrms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumWrong {
	
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       // for(int i : nums){
         //   System.out.println(i);
       // }
        
        List<List<Integer>> finalResult = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-3;i++){
          
            for(int j=i+1;j<nums.length-2;j++){
           
                int first = nums[i];
                int second = nums[j];
                int third = 0 - (first + second);
                int startIndex = j+1;
                int endIndex = nums.length-1;
                Object[] result = searchElement(nums,startIndex,endIndex,third);
                boolean res = (boolean)result[0];
            if(res){
                List<Integer> data = Arrays.asList(first,second,(int)result[1]);
                finalResult.add(data);
             }
            }
           
        }
        
        
        return finalResult;
    }
    
    private Object[] searchElement(int[] nums,int startIndex,int endIndex,int element){
    	
        
        Object[] result = new Object[2];
        result[0] = false;
        while(startIndex < endIndex){
        	int mid = startIndex + (endIndex - startIndex)/2;
        	
            if(nums[mid] == element){
                result[0] = true;
                result[1] = mid;
                return result;
            }else if(nums[mid] < element){
                startIndex = mid + 1;
            }else{
                endIndex = mid - 1;
            }
            
        }
        return result;
    }
    
    public static void main(String args[]) {
    	ThreeSumWrong s = new ThreeSumWrong();
    	int[] arr = {-1,0,1,2,-1,-4};
    	List<List<Integer>> finalResult = s.threeSum(arr);
    	System.out.println(finalResult);
    }
}
