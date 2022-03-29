package strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SuffixTrie {
	
	TrieNode root;
	
	public TrieNode buildSuffixTrie(String word) {
		
		root = new TrieNode();
		root.index = 0;
		
		for(int i=0;i<word.length();i++) {
			TrieNode current = root;
				for(int j=i;j<word.length();j++) {
					
					char ch = word.charAt(j);
					TrieNode  node = current.getChildren().get(ch);
					
					if(node == null) {
						node = new TrieNode();
						node.index = j+1;
						current.getChildren().put(ch,node);
						
					}
					current = node;
				}
				current.endOfWord = true;
				
		}
		return root;
	}
	
	
	public  void subStringSearch(String pattern,TrieNode root) {
		TrieNode current = root;
		
		for(int i=0;i<pattern.length();i++) {
			char ch = pattern.charAt(i);
			TrieNode node = current.getChildren().get(ch);
		
			if(node == null) {
				return;
			}
			
			current = node;
		}
		System.out.println(current.index);
		System.out.println("pattern "+pattern+" is a substring at index :::"+(current.index-pattern.length()));
		
	}
	
	public void substringRepeat(String pattern,TrieNode root) {
		TrieNode current = root;
		
		for(int i=0;i<pattern.length();i++) {
			char ch = pattern.charAt(i);
			TrieNode node = current.getChildren().get(ch);
		
			if(node == null) {
				System.out.println("substring doesn't exist");
				return;
			}
			
			current = node;
		}
		
		checkRepeatCount(current);
		System.out.println("substring repeat"+count);
		
	}
	
	static int count = 0;
	public void checkRepeatCount(TrieNode current) {
		
		HashMap<Character,TrieNode> children = current.getChildren();
		for(Map.Entry<Character,TrieNode> child : children.entrySet()) {
			if(child.getKey() == '$') {
				count = count + 1;
			}else {
				checkRepeatCount(child.getValue());
			}
		}
		
	}
	
	class RepeatedSubStringNode{
		Map<String,Integer> finaldata;
		int count;
		
		RepeatedSubStringNode(){
			finaldata =  new HashMap<>();
		}

		public Map<String, Integer> getFinaldata() {
			return finaldata;
		}

		public void setFinaldata(Map<String, Integer> finaldata) {
			this.finaldata = finaldata;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}
		
	}
	
	RepeatedSubStringNode dataNode = new RepeatedSubStringNode();
	
	
	public RepeatedSubStringNode printAllRepeatedSubStrings(TrieNode root,List<Character> path) {
		TrieNode current = root;
		
		int count = 0;
		HashMap<Character,TrieNode> children = current.getChildren();
		for(Map.Entry<Character,TrieNode> child : children.entrySet()) {
			path.add(child.getKey());
			if(child.getKey() == '$') {
				count = count + 1;		
				
			}else {
				
				dataNode =  printAllRepeatedSubStrings(child.getValue(),path);
				count = count + dataNode.getCount();
				path.remove(path.size() - 1);
				String data = path.stream().map(String::valueOf).collect(Collectors.joining());
				dataNode.getFinaldata().put(data,count);
				dataNode.setCount(count);
				
			}
		}
		
		return dataNode;
		
	}
	
	
	
	
	public static void main(String args[]) {
		SuffixTrie suffixes = new SuffixTrie();
		TrieNode root = suffixes.buildSuffixTrie("MISSISSIPPI$");
		/**HashMap<Character,TrieNode> children = root.getChildren();
		System.out.println("index"+root.index);
		for(Map.Entry<Character,TrieNode> child : children.entrySet()) {
			System.out.println("keys are ::: "+child.getKey()+"");
			
		}**/
		suffixes.subStringSearch("ISSI",root);
		System.out.println("=======================");
		suffixes.substringRepeat("IP",root);
	}

}
