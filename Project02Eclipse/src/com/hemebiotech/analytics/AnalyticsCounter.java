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
	public AnalyticsCounter()
	{
		System.out.println("Reading the file");
	}
	
	//Builder with Parameters
	public AnalyticsCounter(String filePath)
	{
		System.out.println("Reading the file with the parameters");
		ReadSymptomDataFromFile readSymptomFile = new ReadSymptomDataFromFile(filePath);
		listFromFile = readSymptomFile.GetSymptoms();
		
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

