package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Set;

public class TreeMapTest {
	
	static Map<String, Integer> tree_map;

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
    static boolean search(Object lookedValue) 
    { 
    	boolean testResult;
    	testResult = tree_map.containsKey(lookedValue);
    	
        return testResult;
    }
    
    static int ValueOfKey(String key)
    {
    	int i;
    	i = tree_map.get(key);
    	return i;
    }
    
    static void NewFileOut() throws IOException
    {
        Set<String> keys = tree_map.keySet();
        FileWriter writer = new FileWriter ("result.out");
        for(String key: keys){
        	writer.write(key + " : " + tree_map.get(key) + "\n");
        }
		if (writer !=null)
		{
			writer.close();
		}
     
    }
}
