package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalyticsCounter {
	private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0
	
	public static void main(String args[]) {
		// first get input
		BufferedReader 	reader = null;
		String 			line = null;
		FileWriter 		writer = null;
		try {
			reader = new BufferedReader (new FileReader("Project02Eclipse\\symptoms.txt"));
			line = reader.readLine();
			while (line != null) {
				System.out.println("symptom from file: " + line);
					if (line.equals("headache")) {
						headacheCount++;
						System.out.println("number of headaches: " + headacheCount);
					}
					else if (line.equals("rash")) {
						rashCount++;
					}
					else if (line.contains("pupils")) {
						pupilCount++;
					}
				line = reader.readLine();	// get another symptom
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		// next generate output
		try {
			writer = new FileWriter ("result.out");
			writer.write("headache: " + headacheCount + "\n");
			writer.write("rash: " + rashCount + "\n");
			writer.write("dialated pupils: " + pupilCount + "\n");
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		}
	}
}
