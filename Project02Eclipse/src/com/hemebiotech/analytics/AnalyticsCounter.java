package com.hemebiotech.analytics;
import java.util.List;
import java.util.Map;

import com.hemebiotech.reader.*;
import com.hemebiotech.sort.CreateTreeMaptoOrderData;
import com.hemebiotech.sort.ICreate;
import com.hemebiotech.writer.IWriter;
import com.hemebiotech.writer.Writer;

/**
 * 
 * AlayticsCounter will read the String to extract the data.
 * 
 * @see ReadSymptomDataFromFile
 * 
 * The result will be sorted and counted
 * 
 * @see CreateTreeMaptoOrderData
 * 
 * Then the sorted data will be written in an out file
 * 
 * @see Writer
 * 
 * 
 * @author nicolas
 * @version 1.1
 *
 */

public class AnalyticsCounter 
{
	// Stock the path of the file
	String filePath;
	Map<String, Integer> dataToPrint;
	List<String> listFromFile;
	
	//Default builder
	public AnalyticsCounter(String filePath, Map<String, Integer> dataToPrint, List<String> listFromFile) {
		super();
		this.filePath = filePath;
		this.dataToPrint = dataToPrint;
		this.listFromFile = listFromFile;
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


	//Getter to return the value of the variable
	public String getFilePath() {
		return filePath;
	}
	public Map<String, Integer> getDataToPrint() {
		return dataToPrint;
	}


	public List<String> getListFromFile() {
		return listFromFile;
	}

	
	//Setter of the program 
	public void setDataToPrint(Map<String, Integer> dataToPrint) {
		this.dataToPrint = dataToPrint;
	}

	public void setListFromFile(List<String> listFromFile) {
		this.listFromFile = listFromFile;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}

