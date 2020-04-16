package com.hemebiotech.analytics;

/**
 * The program will be run by AnalyticsCounter.
 * The String path will be implemented in the method to extract its data
 * @see AnalyticsCounter
 * @author nicolas
 *
 */

public interface IAnalyticsCounter {

	/**
	 * Will read, order, count and create the final result.out file
	 */
	public void runProcess();
	/**
	 * 
	 * @return the path of the file that was read
	 */
	public String getFilePath();
}
