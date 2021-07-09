package com.adactin.property;

import com.adactin.helper.Configuration_Reader;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
		
	}
	
	public static File_Reader_Manager getObjectFR() {
		File_Reader_Manager fr = new File_Reader_Manager();
		return fr;
	}
 
	public Configuration_Reader getObjectCR() throws Throwable {
		Configuration_Reader cr = new Configuration_Reader();
		return cr;

	}
}
