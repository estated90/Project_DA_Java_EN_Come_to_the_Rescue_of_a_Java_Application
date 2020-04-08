package com.hemebiotech.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class Writer {
    static void NewFileOut() throws IOException
    {
        Set<String> keys = tree_map.keySet();
        FileWriter writer = new FileWriter ("result.out");
        for(String key: keys){
        	writer.write(key + " : " + tree_map.get(key) + "\n");
        }
		if (writer !=null)
		{
			writer.close();
		}
}
