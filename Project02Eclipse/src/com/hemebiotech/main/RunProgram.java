package com.hemebiotech.main;

import com.hemebiotech.analytics.*;
import com.hemebiotech.reader.ReadDataFromFile;
import com.hemebiotech.sort.CreateOrderData;
import com.hemebiotech.writer.Writer;

/**
 * name : main
 * description : the program will read a file symptom.txt.
 * it will order its content and create a file .out at the root.
 * The data will be counted and listed next to the symptom
 *
 * @version : 1.1
 *
 * @see AnalyticsCounter
 *
 * @author Nicolas
 *
 */

public class RunProgram {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 IAnalyticsCounter createFileWithSymptoms = new AnalyticsCounter("Project02Eclipse\\Symptoms.txt", new ReadDataFromFile(), new CreateOrderData(), new Writer());
		 createFileWithSymptoms.runProcess();
		 System.out.println("The file located in " + createFileWithSymptoms.getFilePath() + " has been read.");
		 System.out.println("A file result.out has been created at the root folder");
				
	}
	
	
}
