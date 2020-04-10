package com.hemebiotech.main;

import com.hemebiotech.analytics.*;
import com.hemebiotech.reader.ISymptomReader;

/**
 * Name : Main
 * Description : The program will read a file Symptom.txt. 
 * It will order its content and create a file .out at the root.
 * 
 * @version : 1.1
 * 
 * @see AnalyticsCounter
 * 
 * @author Nicolas
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnalyticsCounter CreateFileWithSymptoms = new AnalyticsCounter("Project02Eclipse\\Symptoms.txt");
		CreateFileWithSymptoms.getFilePath();
		
				
	}

}
