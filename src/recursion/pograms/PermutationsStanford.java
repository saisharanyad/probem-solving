package recursion.pograms;

public class PermutationsStanford {
	
	
	//Print all permutations = npr or n!
	//NO repetitions
	//Order matters
	void printAllPermutations(String empty,String data){
		
		if("".equals(data)){
			System.out.println("empty in line 10 --"+empty);
		}else{
			for(int i=0;i<data.length();i++){
				String choice = empty + String.valueOf(data.charAt(i));
				String remaining = data.substring(0, i) + data.substring(i+1);
				printAllPermutations(choice, remaining);
				
			}
		}
	}
	
	//Print all permutations of k size = n*n*n.. = n(power)k = Arrangements
	//with repetitions
	//Order not considered
	String bin = "01";
	public void printAllPermutationsWithRepetition(String permuteStr,int n) {
		System.out.println("======"+permuteStr+"::::"+n);
		
		if(n==0) {
			System.out.println("permute str is:::"+permuteStr);
			return;
		}
			
		for(int i=0 ; i<2; i++) {
			 
			printAllPermutationsWithRepetition(permuteStr + bin.charAt(i), n-1);
		}
		
		
	}
	
	
	public static void main(String args[]){
		PermutationsStanford permutation = new PermutationsStanford();
		//permutation.printAllPermutations("","abc");
		permutation.printAllPermutationsWithRepetition("",2);
	}

}
