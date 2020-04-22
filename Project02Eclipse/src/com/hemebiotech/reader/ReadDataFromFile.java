package com.hemebiotech.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 * Exception will be risen if an error in the reader or the close
 *
 *@author nicolas
 */
public class ReadDataFromFile implements IReader {
	
	private String filePath;


	
	public ReadDataFromFile () {}
	/**
	 * @param filePathToRead a full or partial path to file with symptom strings in it, one per line
	 */
	
	public List<String> getData(String filePathToRead) {
		this.filePath = filePathToRead;
		ArrayList<String> 	result = new ArrayList<String>();
		BufferedReader 		reader = null;
		String				line = null;
		
		if (filePath != null) {
			try {
				reader = 	new BufferedReader (new FileReader(filePath));
				line = 		reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}
