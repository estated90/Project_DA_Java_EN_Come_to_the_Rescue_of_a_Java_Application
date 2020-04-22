package com.hemebiotech.reader;

import java.util.List;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface IReader {
	/**
	 * If no data is available, return an empty List
	 * @param filePathToRead receive a partial file path.
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	public List<String> getData (String filePathToRead);
	
}
