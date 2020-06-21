package com.bst.righttoleft;

/**
 * @author Tejesh
 *
 */
public class App {


	public static void main(String[] args) {
		BST bst = new BST();
		
		bst.add(8);
		bst.add(3);
		bst.add(10);
		bst.add(1);
		bst.add(6);
		bst.add(4);
		bst.add(7);
		bst.add(14);
		bst.add(13);
		
		System.out.println("/*****Right to left******/");
		bst.rightToLeftPrint();
		System.out.println();
		System.out.println("/*****BFS******/");
		bst.breathFirstSearch();
	}

}
