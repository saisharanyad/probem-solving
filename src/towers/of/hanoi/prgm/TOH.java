package towers.of.hanoi.prgm;

public class TOH {
	
	public void toh(int N,char src,char dest,char temp){//3,A,C,B
		if(N == 0){
			return;
		}
		toh(N-1,src,temp,dest);//2,A,B,C
		System.out.println("Take disk "+N+" from "+src+" to "+dest);
		toh(N-1,temp,dest,src);
		
		
	}
	
	public static void main(String args[]){
		TOH toh = new TOH();
		toh.toh(2,'A','B','C');
	}

}
