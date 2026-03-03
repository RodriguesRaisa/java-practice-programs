package com.javapractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * I have a table and want to store all 
 * table data; which collection should be used and why?
 */
public class WAP_To_Store_All_Table_Data {

	public static void main(String[] args) {
		
		 List<Map<String, Object>> tableData = new ArrayList<>();

	        Map<String, Object> row1 = new HashMap<>();
	        row1.put("Name", "John");
	        row1.put("Age", 30);

	        Map<String, Object> row2 = new HashMap<>();
	        row2.put("Name", "Alice");
	        row2.put("Age", 25);

	        tableData.add(row1);
	        tableData.add(row2);

	        System.out.println(tableData);
	        
	        //I would use List<Map<String, Object>> because it preserves row order, supports
	        //dynamic columns, and allows key-based access similar to database tables.

	}

}
