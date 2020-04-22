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

public class CreateOrderData implements ICreate {
	
	private ListIterator<String> 	it;
	private String 					line;
	private List<String> 			listToRead;
	private Map<String, Integer> 	treeMap;
	
	/**
	 * Simple implementation
	 */
	public CreateOrderData(){}
	
	/**
	 * Function to search in the TreeMap for existing value. 
	 * @param lookedValue the key to look for
	 * @return a boolean to advise if the value exist or not
	 */
    private boolean search(String lookedValue){ 
        return treeMap.containsKey(lookedValue);
    }
	
    /**
     * The program will read all the string in the List. it will check if the value exists or not. if not, it will be added with a value of 1. If the value exist the program will add a +1 to its occurrence.
     @param list list of string with duplicates
     @return a treemap ordered and counted
     */
	@Override
	public Map<String, Integer> treeMapCreation(List<String> list){
		this.listToRead = list;
		it = listToRead.listIterator();
		treeMap = new TreeMap<String, Integer>();
		while(it.hasNext()){
			line = it.next();
			if (search(line)){
				treeMap.put(line, valueOfKey(line)+1);
			} else {
				treeMap.put(line, 1);
			}
			System.out.println(line + " : " + valueOfKey(line));
		}
		return treeMap;
	}
    /**
     * Function to get the value attach to a key
     * @param key to look for in the TreeMap
     * @return the integer value attach to the key to implement it
     */
    private int valueOfKey(String key){
    	return treeMap.get(key);
    }

}
