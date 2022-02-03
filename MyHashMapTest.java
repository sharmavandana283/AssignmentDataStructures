package com.DataStructures;

import org.junit.Test;

import junit.framework.Assert;

public class MyHashMapTest {
	
	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency()
	{
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap =  new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words)
		{
			Integer value = myHashMap.get(word);
			if(value == null) value = 1;
			else value = value + 1;
			myHashMap.add(word,value);
		}
		int frequency = myHashMap.get("or");
		System.out.println(myHashMap);
		Assert.assertEquals(1, frequency);
	}
	

}
