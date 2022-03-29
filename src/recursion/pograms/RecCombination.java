package recursion.pograms;

public class RecCombination {
	
	int count = 0;
	
	//Print number of combinations = nck = nc(n-k) = total number of subsets of size k
	int nChooseK(int n , int k){
		System.out.println(count+"--n val--"+n+"--k val--"+k);
		if(k==0 || k==n){
			return 1;
		}
		else{
			return nChooseK(n-1, k)+nChooseK(n-1, k-1);
		}
	}
	                                                                                                                                                
	
	void printAllCombinationsofSizeK(int n , int k){
		System.out.println(count+"--n val--"+n+"--k val--"+k);
		if(k==0 || k==n){
			//return 1;
		}
		else{
			//return nChooseK(n-1, k)+nChooseK(n-1, k-1);
		}
	}
	
	public static void main(String args[]){
		RecCombination rC = new RecCombination();
		int result = rC.nChooseK(4, 3);
		System.out.println(result);
	}

}
