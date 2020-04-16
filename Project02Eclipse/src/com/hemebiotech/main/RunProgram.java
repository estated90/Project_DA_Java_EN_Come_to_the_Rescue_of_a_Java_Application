package com.hemebiotech.main;

import com.hemebiotech.analytics.*;
import com.hemebiotech.reader.IReader;
import com.hemebiotech.reader.ReadDataFromFile;
import com.hemebiotech.sort.CreateOrderData;
import com.hemebiotech.writer.Writer;

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

public class RunProgram {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 AnalyticsCounter createFileWithSymptoms = new AnalyticsCounter("Project02Eclipse\\Symptoms.txt",
				 new ReadDataFromFile(),
			new CreateOrderData(),
			new Writer());
		 System.out.println("The file located in " + createFileWithSymptoms.getFilePath() + " has been read.");
		 System.out.println("A file result.out has been created at the root folder");
				
	}
	
	
}
