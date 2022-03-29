package stack.programs;

public class ArrayStack {
	
	int top = -1;
	int arr[];
	
	public void push(int data){
		if(top < arr.length)
			arr[++top] = data;
	}
	
	public void pop(){
		if(top > -1 && top < arr.length){
			int data = arr[top];
			System.out.println(data);
			arr[top] = 0;
			top--;
		}
		
	}
	
	
	public void top(){
		if(top > -1 && top < arr.length){
			int data = arr[top];
			System.out.println(data);
		}
		
	}
	
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public static void main(String args[]){
		ArrayStack as = new ArrayStack();
		as.arr = new int[10];
		as.push(2);
		as.push(3);
		as.push(4);
		as.pop();
		as.top();
		System.out.println(as.isEmpty());
		for(int data : as.arr){
			System.out.println(data);
		}
	}

}
