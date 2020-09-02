package com.ds.bt.iterativeinordertraversal;

import java.util.Stack;

public class IterativeInorderTraversal {

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
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		
		root = first;
		
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		second.right = fifth;
		
		third.left = sixth;	
	}
	
	public void iterativeInorderTraversal(){
		if(root == null){
			return;
		}
		
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		
		while(!stack.isEmpty() || temp != null){
			if(temp != null){
				stack.push(temp);
				temp = temp.left;
			}else{
				temp = stack.pop();
				System.out.println(temp.data+ " ");
				temp = temp.right;
			}
		}
	}
	
	public static void main(String[] args) {
		IterativeInorderTraversal bt = new IterativeInorderTraversal();
		bt.createBinaryTree();
		bt.iterativeInorderTraversal();
	}

}
