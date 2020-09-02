package com.ds.bt.recursivepostordertraversal;

public class RecursivePostOrderTraversal {

	/**
	 * @Ashish Ku. Dey
	 */
	
	private TreeNode root;
	
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data){
			this.data = data;
		}
	}
	
	public void createBinaryTree(){
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		
		root = first;
		
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		
	}
	
	public void recursivePostOrderTraversal(TreeNode root){
		if(root == null){
			return;
		}
		
		recursivePostOrderTraversal(root.left);
		recursivePostOrderTraversal(root.right);
		System.out.println(root.data+ " ");
		
	}
	
	public static void main(String[] args) {
		RecursivePostOrderTraversal bt = new RecursivePostOrderTraversal();
		bt.createBinaryTree();
		bt.recursivePostOrderTraversal(bt.root);

	}

}
