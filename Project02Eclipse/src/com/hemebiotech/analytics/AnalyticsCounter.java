package com.hemebiotech.analytics;


import java.util.List;

import com.hemebiotech.reader.*;

public class AnalyticsCounter 
{
	// Stock the path of the file
	String filePath, Symptom;
	List<String> listFromFile;
	int Occurences;
	
	//Instances of behavior

	ISymptomReader listSymptom = new ReadSymptomDataFromFile(filePath);

	//Default Builder
	public AnalyticsCounter(String filePath, String symptom, List<String> listFromFile, int occurences,
			ISymptomReader listSymptom) {
		super();
		this.filePath = filePath;
		Symptom = symptom;
		this.listFromFile = listFromFile;
		Occurences = occurences;
		this.listSymptom = listSymptom;
	}

	//Builder with Parameters
	public AnalyticsCounter(String filePath)
	{
		System.out.println("Reading the file with the parameters");
		ReadSymptomDataFromFile readSymptomFile = new ReadSymptomDataFromFile(filePath);
		listFromFile = readSymptomFile.getSymptoms();
		
	}
	  //*************   ACCESSEURS *************
	public String GetPath()
	{
		return filePath;
	}
	  //*************   MUTATEURS   *************
	public void setPath(String pPath)
	{
		this.filePath = pPath;
	}
}

