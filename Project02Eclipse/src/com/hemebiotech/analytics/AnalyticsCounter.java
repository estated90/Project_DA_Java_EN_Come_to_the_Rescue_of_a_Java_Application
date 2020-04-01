package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Nicolas
 * The program will read all document symptom.txt in the Project02Eclipse file
 * Creation of a TreeMap to order the symptom and avoid any duplicate
 * Then the program will sum up the the results in a file
 * 
 */

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		// Declaration of the file to read
		try
		{
		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse\\symptoms.txt"));
		String line = reader.readLine();
		
		// Call class to create a TreeMap
		TreeMapTest.create();
		
		// Read all the line, create or add the symptom to the list
		while (line != null) 
		{	
			if (TreeMapTest.search(line))
			{
				TreeMapTest.insert(line, TreeMapTest.ValueOfKey(line)+1);
			}
			else
			{
				TreeMapTest.insert(line, 1);
			}
			// get another symptom
			line = reader.readLine();
		}
		//Closing the resources
		if (reader != null)
		{
			reader.close();
		}
		
		TreeMapTest.NewFileOut();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
