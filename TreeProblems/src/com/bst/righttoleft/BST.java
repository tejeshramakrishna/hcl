/**
 * 
 */
package com.bst.righttoleft;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Tejesh
 *
 */
public class BST {
	Node root;
	public BST() {
	}
	
	private Node addRecursive(Node current,int value) {
		if(current==null) {
			return new Node(value);
		}
		if(value > current.data) {
			current.right = addRecursive(current.right, value); 
		}else if(value < current.data) {
			current.left = addRecursive(current.left, value);
		}
		return current;
	}
	
	public void add(int value) {
		root = addRecursive(root, value);
	}
	
	//delete() not required now
	
	private void rightToLeftRecursion(Node node) {
		if(node == null) {
			System.out.println("Tree is empty");
			return;
		}
		if(node.right==null && node.left==null) {
			System.out.print(" "+node.data);
			return;
		}
		if(node.right != null) {
			rightToLeftRecursion(node.right);
		}
		if(node.left != null) {
			rightToLeftRecursion(node.left);
		}
	}
	
	public void rightToLeftPrint() {
		rightToLeftRecursion(root);
	}
	
	public void breathFirstSearch() {
	    if (root == null) {
	        return;
	    }
	 
	    Queue<Node> nodes = new LinkedList<>();
	    nodes.add(root);
	 
	    while (!nodes.isEmpty()) {
	 
	        Node node = nodes.remove();
	 
	        System.out.print(" " + node.data);
	 
	        if (node.left != null) {
	            nodes.add(node.left);
	        }
	 
	        if (node.right != null) {
	            nodes.add(node.right);
	        }
	    }
	}

}
