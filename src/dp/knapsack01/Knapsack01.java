package dp.knapsack01;

public class Knapsack01 {
	
	//recursion
	public static int knapsack01(int[] wts,int[] val,int maxW,int n,int funcno) {
		//System.out.println("function num=="+funcno); 
		//System.out.println("wts=="+wts+" val=="+val+" maxW=="+maxW+" n=="+n);
		
		if(n == 0 || maxW == 0) {
			return 0;
		}
		
		if(wts[n-1] <= maxW) {
			//System.out.println("in if== "+wts[n-1]);
			int result =  Math.max(val[n-1]+knapsack01(wts,val,maxW-wts[n-1],n-1,1),
					knapsack01(wts,val,maxW,n-1,2));
			//System.out.println("result1=="+result);
			return result;
		}else if(wts[n-1] > maxW){
			//System.out.println("in else=="+wts[n-1]);
			int result= knapsack01(wts,val,maxW,n-1,3);
			//System.out.println("result2=="+result);
			return result;
		}
		
		return -1;
		
	}
	
	//Top down memoization
	public static int knapsack01TDM(int[] wts,int[] val,int maxW,int n,int funcno) {
		//System.out.println("function num=="+funcno); 
		//System.out.println("wts=="+wts+" val=="+val+" maxW=="+maxW+" n=="+n);
		
		if(n == 0 || maxW == 0) {
			return 0;
		}
		
		if(wts[n-1] <= maxW) {
			//System.out.println("in if== "+wts[n-1]);
			int result =  Math.max(val[n-1]+knapsack01(wts,val,maxW-wts[n-1],n-1,1),
					knapsack01(wts,val,maxW,n-1,2));
			//System.out.println("result1=="+result);
			return result;
		}else if(wts[n-1] > maxW){
			//System.out.println("in else=="+wts[n-1]);
			int result= knapsack01(wts,val,maxW,n-1,3);
			//System.out.println("result2=="+result);
			return result;
		}
		
		return -1;
		
	}
	
	//bottom-up tabulation
	public static int knapsack01BUTab(int[] wts,int[] val,int maxW,int n,int funcno) {
		//System.out.println("function num=="+funcno); 
		//System.out.println("wts=="+wts+" val=="+val+" maxW=="+maxW+" n=="+n);
		
		if(n == 0 || maxW == 0) {
			return 0;
		}
		
		if(wts[n-1] <= maxW) {
			//System.out.println("in if== "+wts[n-1]);
			int result =  Math.max(val[n-1]+knapsack01(wts,val,maxW-wts[n-1],n-1,1),
					knapsack01(wts,val,maxW,n-1,2));
			//System.out.println("result1=="+result);
			return result;
		}else if(wts[n-1] > maxW){
			//System.out.println("in else=="+wts[n-1]);
			int result= knapsack01(wts,val,maxW,n-1,3);
			//System.out.println("result2=="+result);
			return result;
		}
		
		return -1;
		
	}
	
	public static void main(String args[]) {
		//int[] wts = {10,20,30};
		//int[] val = {60,100,120};
		int[] wts = {1,3,4,5};
		int[] val = {1,2,4,3};
		int maxW = 7;
		int n = 4;
		int maxProfit = knapsack01(wts,val,maxW,n,1);
		//System.out.println("maxProfit is=="+maxProfit);
	}

}
