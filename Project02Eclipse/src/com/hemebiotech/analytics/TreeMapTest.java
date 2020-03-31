package com.hemebiotech.analytics;

import java.util.*;

public class TreeMapTest {

	/*public static void SyptomOccurences(String getSymptom,int getOccurence)
	{
		HashMap<String, Integer> hash_map = new HashMap<String, Integer>(); 
		hash_map.put(getSymptom, getOccurence);
		System.out.println("number of " + getSymptom + " : " + getOccurence);
	}*/
	
	static TreeMap<String, Integer> tree_map;

	static void create()
	{
		tree_map = new TreeMap<String, Integer>();
	}
	
	static void insert (String getSymptom, int getOccurence)
	{
		tree_map.put(getSymptom, getOccurence);
		System.out.println("number of " + getSymptom + " : " + getOccurence);
	}
	
    // Function to search a key in TreeMap 
    static void search(String key) 
    { 
        // Checking for the key 
        tree_map.containsKey(key); 
    } 
}
