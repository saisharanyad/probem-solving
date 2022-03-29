package linked.list.programs;



public class UpgradLinkedListImpl {

	public static void main(String args[]){
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	//TODO
    	String[] arrData = {"7","5","45","7","4"};
		/**try {
			arrData = br.readLine().split("\\s");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}**/
    	linked.list.programs.LinkeList linkedList = new LinkeList();
    	for(int i = 0 ; i < arrData.length; i++){
    	     linkedList.push(Integer.parseInt(arrData[i]));
    	}
    	linkedList.printList();
    	System.out.println("---------------------");
    	linkedList.moveLastElementToHead();
    	linkedList.printList();
    }
		
	}

