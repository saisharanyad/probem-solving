package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Trie {
	
	private  TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	//insert a word into a prefix tree
	public  void insertWord(String word) {
		TrieNode current = root;
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if(node == null) {
				node = new TrieNode();
				current.children.put(ch,node);
			}
			current = node;
		}
		current.endOfWord = true;
	}
	
	
	//insert a word into a prefix tree - Recursive
	public  void insertRecursive(String word) {
		insertRecursive(word,root,0);
	}
	
	public  void insertRecursive(String word,TrieNode current,int index) {
		
		if(word.length() == index) {
			current.endOfWord = true;
			return;
		}
		
		
		char ch = word.charAt(index);
		TrieNode node = current.children.get(ch);
		if(node == null) {
			node = new TrieNode();
			current.children.put(ch,node);
		}
		current = node;
		insertRecursive(word,current,index+1);
	}
	
	
	//Search a word in a prefix tree
	public boolean searchWord(String word) {
		
		TrieNode current = root;
		for(int i = 0;i < word.length();i++) {
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if(node == null) {
				return false;
			}
			current = node;
		}
		return current.endOfWord;
	}
	
	public boolean searchWordRecursive(String word) {
		return searchWordRecursive(word,0,root);
	}
	
	//Search a word in a prefix tree - Recursive
	public boolean searchWordRecursive(String word,int index,TrieNode current) {
		
			if(index == word.length()) {
				return current.endOfWord;
			}
		
			char ch = word.charAt(index);
			TrieNode node = current.children.get(ch);
			if(node == null) {
				return false;
			}
			current = node;
		
			return searchWordRecursive(word,index+1,current);
	}
	
	
	//Get the list of words that matches the prefix
	public List<String> prefixMatchWords(String prefix) {
		TrieNode current = root;
		List<String> output = new ArrayList<String>();
		for(int i = 0;i < prefix.length();i++) {
			char ch = prefix.charAt(i);
			TrieNode node = current.children.get(ch);
			if(node == null) {
				return output;
			}
			current = node;
		}
		
		List<Character> path = new ArrayList<>();

		for (char ch: prefix.toCharArray()) {
			path.add(ch);
		}
		
		//return output;
		return collectWords(current,path,output);
	}
	
	private List<String> collectWords(TrieNode current,List<Character> path,
			List<String> output) {
	
		if(current.endOfWord) {
		
			String word = path.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining());
			 output.add(word);
		}
		
		HashMap<Character,TrieNode> children = current.getChildren();
		for(Map.Entry<Character,TrieNode> mapElement : children.entrySet()) {
			char ch = mapElement.getKey();
			TrieNode node = mapElement.getValue();
			path.add(ch);
		    collectWords(node,path,output);
			path.remove(path.size() - 1);
		}
		
		return output;
	}
	
	
	public static void main(String args[]) {
		Trie trie = new Trie();
		System.out.println("-------------------insert-------------------------");
		trie.insertWord("their");
		trie.insertWord("there");
		trie.insertWord("this");
		trie.insertWord("that");
		trie.insertWord("does");
		trie.insertWord("digl");
		trie.insertWord("didf");
		System.out.println("-------------------search-------------------------");
		System.out.println(trie.searchWord("did"));
		System.out.println(trie.searchWord("di"));
		System.out.println(trie.searchWord("this"));
		System.out.println(trie.searchWord("there"));
		System.out.println("------------------collect words-------------------");
		System.out.println(trie.prefixMatchWords("th"));
	}

}
