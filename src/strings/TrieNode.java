package strings;

import java.util.HashMap;

public class TrieNode {
	public HashMap<Character,TrieNode> children;
	public boolean endOfWord;
	public String endOfSuffix;
	public int index;
	
	public TrieNode() {
		children = new HashMap<Character, TrieNode>();
	}

	public HashMap<Character, TrieNode> getChildren() {
		return children;
	}

	public void setChildren(HashMap<Character, TrieNode> children) {
		this.children = children;
	}

	
	
	
	
}
