package com.hemebiotech.sort;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;


public class CreateTreeMaptoOrderData implements ICreate
{
	
	private Map<String, Integer> treeMap;
	private List<String> listToRead;
	private ListIterator<String> it;
	
	public CreateTreeMaptoOrderData(List<String>result)
	{
		this.listToRead = result;
	}
	
	@Override
	public Map<String, Integer> TreeMapCreation()
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
		}
		return treeMap;
	}
	
    public boolean Search(Object lookedValue) 
    { 
    	boolean testResult;
    	testResult = treeMap.containsKey(lookedValue);
    	
        return testResult;
    }

    public int ValueOfKey(String key)
    {
    	int i;
    	i = treeMap.get(key);
    	return i;
    }

}
