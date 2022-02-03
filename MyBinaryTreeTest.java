package com.DataStructures;

import org.junit.Test;

import junit.framework.Assert;

public class MyBinaryTreeTest {
	
	@Test
	public void given3NumbersWhenReturnToBinaryTreeShouldReturnSize()
	{
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		
		int size = myBinaryTree.getSize();
		System.out.println(size);
		Assert.assertEquals(3, size);
	}
	
	@Test
	public void given13NumbersWhenReturnToBinaryTreeShouldReturnSize()
	{
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(67);
		myBinaryTree.add(63);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		
		int size = myBinaryTree.getSize();
		System.out.println(size);
		Assert.assertEquals(13, size);
	}
	
	@Test
	public void given13NumbersAddedBinaryTree_SearchNumber()
	{
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(67);
		myBinaryTree.add(63);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		
		boolean numberFound = myBinaryTree.search(63);
		Assert.assertEquals(true, numberFound);
	}
	
	
	

}
