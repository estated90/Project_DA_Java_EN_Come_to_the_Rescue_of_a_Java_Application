package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;

import com.hemebiotech.reader.*;
import com.hemebiotech.sort.CreateTreeMaptoOrderData;
import com.hemebiotech.sort.ICreate;
import com.hemebiotech.writer.IWriter;
import com.hemebiotech.writer.Writer;

public class AnalyticsCounter 
{
	// Stock the path of the file
	String filePath, Symptom;
	Map<String, Integer> dataToPrint;
	List<String> listFromFile;
	int Occurences;
	
	//Instances of behavior

	
	

	//Default Builder
	public AnalyticsCounter(String filePath, String symptom, List<String> listFromFile, int occurences,
			ISymptomReader listSymptom) {
		super();
		this.filePath = filePath;
		Symptom = symptom;
		this.listFromFile = listFromFile;
		Occurences = occurences;
	}

	//Builder with Parameters
	public AnalyticsCounter(String filePath)
	{
		ISymptomReader readSymptomFile = new ReadSymptomDataFromFile(filePath);
		System.out.println("Reading the file with the parameters");
		listFromFile = readSymptomFile.getSymptoms();
		ICreate treeMapCreation = new CreateTreeMaptoOrderData(listFromFile);
		dataToPrint = treeMapCreation.treeMapCreation();
		IWriter createFileOut = new Writer(dataToPrint);
		createFileOut.newFileOut();
	}
}

