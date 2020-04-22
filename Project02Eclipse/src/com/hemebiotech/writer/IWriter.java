package com.hemebiotech.writer;

import java.util.Map;

/**
 * will read the data of a TreeMap with parameters String, Integer
 * Will write the values in an out files located at the root file
 * 
 */
public interface IWriter{
	/**
	 * Read the Map and write it line after line
	 * @param treeMap receive the data as a tree map with a list of string as key and integer as dependency
	 * 
	 */
	public void newFileOut(Map<String, Integer> treeMap);
}
