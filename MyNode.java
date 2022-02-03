package com.DataStructures;

public class MyNode<K> implements com.DataStructures.INode<K>{

	private K Key;
	private INode next;	
	
	
	public MyNode(K Key)
	{
		this.Key=Key;
		this.next=null;
	}

	public INode getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = next;
	}

	@Override
	public K getKey() {		
		return Key;
	}

	@Override
	public void setKey(K key) {
		this.Key=Key;
		
	}
}
