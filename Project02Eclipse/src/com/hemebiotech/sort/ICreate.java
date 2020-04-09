package com.hemebiotech.sort;

import java.util.Map;

/**
 * The data of a list of String will be read
 * The function will delete the duplicates and raise the occurrences instead
 * There will be no duplicates
 * 
 * @author nicolas
 *
 */

public interface ICreate 
{
	/**
	 * @return Return a sorted and counted list with unique values
	 */
	public Map<String, Integer> treeMapCreation();
}
