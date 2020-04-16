package com.hemebiotech.analytics;
import java.util.List;
import java.util.Map;

import com.hemebiotech.reader.*;
import com.hemebiotech.sort.CreateOrderData;
import com.hemebiotech.sort.ICreate;
import com.hemebiotech.writer.IWriter;
import com.hemebiotech.writer.Writer;

/**
 * 
 * AlayticsCounter will read the String to extract the data.
 * 
 * @see ReadDataFromFile
 * 
 * The result will be sorted and counted
 * 
 * @see CreateOrderData
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

public class AnalyticsCounter implements IAnalyticsCounter
{
	// Stock the path of the file
	private String filePath;
	private Map<String, Integer> dataToPrint;
	private List<String> listFromFile;
	
	//Instances declaration
	IReader readDataFromFile = null;
	ICreate treeMapCreation = null;
	IWriter createFileOut = null;
	
	//Default builder
	public AnalyticsCounter(String filePath,IReader readDataFromFile, ICreate treeMapCreation, IWriter createFileOut) {
		super();
		System.out.println("Reading the file");
		this.filePath = filePath;
		this.readDataFromFile = readDataFromFile;
		this.treeMapCreation = treeMapCreation;
		this.createFileOut = createFileOut;
	}
	//Where the difference part of the program take place
	public void runProcess() {
		listFromFile = readDataFromFile.getData(filePath);
		dataToPrint = treeMapCreation.treeMapCreation(listFromFile);
		createFileOut.newFileOut(dataToPrint);
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

