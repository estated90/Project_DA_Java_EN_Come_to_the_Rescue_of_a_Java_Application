package com.hemebiotech.main;

import com.hemebiotech.analytics.*;
import com.hemebiotech.reader.IReader;

/**
 * name : main
 * description : the program will read a file symptom.txt.
 * it will order its content and create a file .out at the root.
 *
 * @version : 1.1
 *
 * @see analyticscounter
 *
 * @author nicolas
 *
 */

public class Main {
public class RunProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnalyticsCounter CreateFileWithSymptoms = new AnalyticsCounter("Project02Eclipse\\Symptoms.txt");
		CreateFileWithSymptoms.getFilePath();
		
				
	}

}
