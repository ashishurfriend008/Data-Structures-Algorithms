package com.ds.tries;

public class TriesDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	//root points to the empty TrieNode
	private TrieNode root;
	
	public TriesDemo(){
		root = new TrieNode(); //root is empty
	}
	
	private class TrieNode{
		private TrieNode[] children;
		private boolean isWord;
		
		public TrieNode(){
			this.children = new TrieNode[26]; //storing english words a to z
			this.isWord = false;
		}
	}
	
	public void insert(String word){
		if(word == null || word.isEmpty()){
			throw new IllegalArgumentException("Invalid Input");
		}
		TrieNode current = root;
		for(int i = 0; i<word.length(); i++){
			char c = word.charAt(i);
			int index = c - 'a';
			if(current.children[index] == null){
				TrieNode node = new TrieNode();
				current.children[index] = node;
				current = node;
			}else{
				current = current.children[index]; 
			}
		}
		    current.isWord = true;
	}
	
	public static void main(String[] args) {
		TriesDemo trie = new TriesDemo();
		trie.insert("cat");
		trie.insert("cab");
		trie.insert("son");
		trie.insert("so");
		System.out.println("Values inserted successfully !!");
		

	}

}
