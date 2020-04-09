package com.hemebiotech.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 * Simple read of a Map data then write it
 * Exception will be risen if an error occur in the writer or the close 
 * @author nicolas
 *
 */

public class Writer implements IWriter{
    
	private Map<String,Integer> dataToPrint;

	/**
	 * 
	 * @param treeMap of the data top write with parameters String and Integer
	 */
	public Writer(Map<String,Integer>treeMap)
	{
		this.dataToPrint = treeMap;
	}
	
	@Override
	public void newFileOut()
    {
        Set<String> keys = dataToPrint.keySet();
        FileWriter writer = null;
        try
        {
	        writer = new FileWriter ("result.out");
	        for(String key: keys){
	        	writer.write(key + " : " + dataToPrint.get(key) + "\n");
	        }
        }catch (IOException e)
        {
        	e.printStackTrace();
        }
        finally
        {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        }
    }
}
