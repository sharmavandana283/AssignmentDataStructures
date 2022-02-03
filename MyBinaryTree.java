package com.DataStructures;

public class MyBinaryTree<K extends Comparable<K>> {

	private MyBinaryNode<K> root = null;
	
	public void add(K key) {
		this.root = this.addRecursively(root,key);		
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		
		if(current == null)
			return new MyBinaryNode<>(key);
		
		int compareResult = key.compareTo(current.key);
		
		if(compareResult == 0) return current;
		if(compareResult < 0)
		{
			current.left = addRecursively(current.left, key);
		}
		else
		{
			current.right = addRecursively(current.right, key);
		}		
		return current;
	}

	public int getSize() {
		
		return this.getSizeRecursively(root);
	}

	private int getSizeRecursively(MyBinaryNode<K> current) {
		
		return current == null ? 0 : 1 + this.getSizeRecursively(current.left)
		                               + this.getSizeRecursively(current.right) ;
	}
	
	public boolean search(K key) {
		this.root = this.searchRecursively(root,key);
		
		return root == null ? false : true;
		
	}

	public MyBinaryNode<K> searchRecursively(MyBinaryNode<K> current, K key)
	{
	    if (current==null || current.key==key)	    	
	        return current; 
	    
	    if (key.compareTo(current.key)<0)
	       return searchRecursively(current.left, key);
	 
	    return searchRecursively(current.right, key);
	}
}
