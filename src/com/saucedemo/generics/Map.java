package com.saucedemo.generics;

import java.util.HashMap;

public class Map 
{
	static HashMap<String, String> m;
	public static void readDataToMap(String sheetname)
	{
		
		m=new HashMap<>();
		Excel.openExcel();
		Excel.identifySheet(sheetname);
		int rowcount = Excel.identifyRowCount();
		for(int rownum=0;rownum<rowcount; rownum++)
		{
			Excel.identifyRow(rownum);
			Excel.identifyCell(0);
			String key = Excel.identifyCellData();
			Excel.identifyCell(1);
			String value = Excel.identifyCellData();
			m.put(key, value);
		}
	}
	public static String getDataFromMap(String keyname)
	{
		return m.get(keyname);

}
	
	
}


