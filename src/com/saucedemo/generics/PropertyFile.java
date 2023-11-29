package com.saucedemo.generics;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile 
{
	static FileInputStream f ;
	public static String getDataFromPropertyFile(String keyname)
	{
		Properties p=new Properties();
		try
		{
			p.load(new FileInputStream(Utility_Interface.ProprtyFilePath));
		} 
		catch (Exception e) {
			
		}
		return p.getProperty(keyname);

}
	
}
