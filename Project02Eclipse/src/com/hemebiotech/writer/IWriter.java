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
	 * 
	 */
	public void newFileOut(Map<String, Integer> treeMap);
}
