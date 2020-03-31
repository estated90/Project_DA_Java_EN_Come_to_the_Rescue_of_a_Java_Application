package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	private static int headCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;
	
	public static void main(String args[]) throws Exception {
		
		// Declaration of the file to read
		BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse\\symptoms.txt"));
		String line = reader.readLine();

		while (line != null) 
		{
			/*System.out.println("symptom from file: " + line);
			if (line.equals("headache")) 
			{
					headCount++;
					System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rash")) 
			{
				rashCount++;
			}
			else if (line.contains("pupils")) 
			{
				pupilCount++;
			}*/
			TreeMapTest.create();
			TreeMapTest.insert(line, 1);
			// get another symptom
			line = reader.readLine();
		}
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");

		
		//Closing the resources
		if (reader != null)
			{
			reader.close();
			}
		if (writer !=null)
		{
			writer.close();
		}
	}
}
