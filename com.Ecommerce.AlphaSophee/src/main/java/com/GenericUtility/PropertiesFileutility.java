package com.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesFileutility {
	
	/**Read The Data From PropertiesFile
	 * @author Soumya
	 * @param key
	 * @return
	 * @throws Throwable
	 */

	
	public String getpropertiesFileData(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IpathConstant.propertiesfilepath);
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
}
