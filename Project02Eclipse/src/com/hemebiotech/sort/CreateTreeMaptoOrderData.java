package com.hemebiotech.sort;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

/** 
 * Will read all the lines of the communicated String
 * @author nicolas
 *
 */

public class CreateTreeMaptoOrderData implements ICreate
{
	
	private Map<String, Integer> treeMap;
	private List<String> listToRead;
	private ListIterator<String> it;
	
	/**
	 * 
	 * @param result a list of String with duplicates.
	 */
	public CreateTreeMaptoOrderData(List<String>result)
	{
		this.listToRead = result;
	}
	
	@Override
	public Map<String, Integer> treeMapCreation()
	{
		it = listToRead.listIterator();
		treeMap = new TreeMap<String, Integer>();
		while(it.hasNext())
		{
			String line = it.next();
			if (Search(line))
			{
				treeMap.put(line, ValueOfKey(line)+1);
			}
			else
			{
				treeMap.put(line, 1);
			}
			System.out.println(line + " : " + ValueOfKey(line));
		}
		return treeMap;
	}
	
	/**
	 * Function to search in the TreeMap for existing value
	 * @param lookedValue the key to look for
	 * @return a boolean to advise if the value exist or not
	 */
    public boolean Search(Object lookedValue) 
    { 
    	boolean testResult;
    	testResult = treeMap.containsKey(lookedValue);
    	
        return testResult;
    }
    /**
     * Function to get the value attach to a key
     * @param key to look for in the TreeMap
     * @return the integer value attach to the key to implement it
     */
    public int ValueOfKey(String key)
    {
    	int occrurencesOfKey;
    	occrurencesOfKey = treeMap.get(key);
    	return occrurencesOfKey;
    }

}
