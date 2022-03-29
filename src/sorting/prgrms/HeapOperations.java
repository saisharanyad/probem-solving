package sorting.prgrms;

public class HeapOperations {
	
	int arrHeap[] = new int[100];
	int size = 0;
	int i = 0;
	
	public void insertElementMax(int element){
		
		System.out.println("Insert next max element"+element);
		arrHeap[size+1] = element;
		size += 1;
		i=size;
	
		while(i <= size && i!=1 && heapPropertyInsertMax()){
			System.out.println("swap"+i+" and "+i/2);
			int pI = i/2;
			int tmp = arrHeap[i];
			arrHeap[i] = arrHeap[pI];
			arrHeap[pI] = tmp;
			i=pI;
			}
		printHeap();
		
	}
	
	public void deleteElementMax(){
		System.out.println("delete next max element"+arrHeap[1]);
		if(size == 1){
			arrHeap[1] = 0;
			size -= 1;
			return;
		}
		arrHeap[1] = arrHeap[size];
		size -= 1;
		i = 1;
		while(size != 1 && i <= size  && heapPropertyDeleteMax()){
			int cI = findMax();
			int tmp = arrHeap[i];
			arrHeap[i] = arrHeap[cI];
			arrHeap[cI] = tmp;
			i=cI;
		}
		
		printHeap();			
	}
	
	public boolean heapPropertyInsertMax(){
		
		int parent = i/2;
		if(arrHeap[i] > arrHeap[parent]){
			return true;
		}
		
		return false;
	}
	
	public boolean heapPropertyDeleteMax(){
		System.out.println("heapPropertyDeleteMax"+size+"==="+i);
		int childone = 2*i;
		int childtwo = (2*i)+1;
		
		if(childone <= size){
			System.out.println("in c1");
			if(childtwo <= size){
				System.out.println("in c1 c2");
				if((arrHeap[i] < arrHeap[childone]) || (arrHeap[i] < arrHeap[childtwo])){
					return true;
				}
			}else{
				System.out.println("in c1");
				if(arrHeap[i] < arrHeap[childone]){
					return true;
				}
			}
		}
		
		
		return false;
	 }
	
	public int findMax(){
		System.out.println("in findmax");
		int pos = 0;
		int childone = 2*i;
		int childtwo = (2*i)+1;
		
		if(childone <= size){
			if(childtwo <= size){
				 int max = Math.max(arrHeap[childone], arrHeap[childtwo]);
				 if(arrHeap[childone] == max){
					 pos = childone;
				 }else{
					 pos = childtwo;
				 }
			}else{
				if(arrHeap[i] < arrHeap[childone]){
					return childone;
				}
			}
		}
		
		return pos;
	}
	
	public void printHeap(){

		for(int j=1;j<=size;j++){
			System.out.println(arrHeap[j]);
		}
	}
	
	
	
	public static void main(String args[]){
		HeapOperations hpOp = new HeapOperations();
		hpOp.insertElementMax(20);
		hpOp.insertElementMax(12);
		hpOp.insertElementMax(6);
		hpOp.insertElementMax(50);
		hpOp.insertElementMax(4);
		hpOp.insertElementMax(9);
		hpOp.deleteElementMax();
		hpOp.deleteElementMax();
		hpOp.deleteElementMax();
		hpOp.deleteElementMax();
		hpOp.deleteElementMax();
		hpOp.deleteElementMax();
	}

}
