	package com.ds.all;

import java.util.Stack;

public class BinaryTree {
	
	private TreeNode root;
	
	private class TreeNode{
		
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data){
			this.data = data;
		}
	}
	
	/*
	 * Below method will create a binary tree
	 */
	public void createBinaryTree(){
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		
		/*
		 * In order to store this in the binary tree we assign the value of first 
		 * to root.So , now root will be holding the TreeNode having data as 1.
		 */
		root = first; //root ---> first
		first.left = second;
		first.right = third; //second <--- first --->third
		
		second.left = fourth;
		
	}
	
	/*
	 * Pre-order traversal of binary tree
	 */
	public void preOrder(TreeNode root){
		
		if(root == null){
			return;
		}
		/*
		 * If root is not equal to null
		 */
		System.out.println(root.data + " , ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	/*
	 * Iterative pre-order traversal
	 */
	public void preOrder(){
		if(root == null){
			return;
		}
		//create a stack from java.util package
		Stack<TreeNode> stack = new Stack<TreeNode>();
		//push the root on the stack
		stack.push(root);
		/*
		 * provide a while loop to check the stack is empty or not.If while loop 
		 * is not empty then stack is executed.
		 */
		while(!stack.isEmpty()){
			//create temp node and pop the element from the stack
			TreeNode temp = stack.pop();
			//print the poped data on the console
			System.out.println(temp.data +" , ");
			/*
			 * check temp right is null or not.If temp.right is not null then
			 * simply push temp.right on the stack.
			 */
			if(temp.right != null){
				stack.push(temp.right);
			}
			//We will do the above step for temp.left as well
			if(temp.left != null){
				stack.push(temp.left);
			}
		}
	}

	public static void main(String[] args) {
		
		//instance of binary tree
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		bt.preOrder(bt.root);
		System.out.println("*******************");
		bt.preOrder();
		

	}

}
