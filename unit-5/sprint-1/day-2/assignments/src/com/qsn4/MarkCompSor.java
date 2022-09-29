package com.qsn4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MarkCompSor implements Comparator<Map.Entry<String,Student>>{

	@Override
	public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
		// TODO Auto-generated method stub
		if(o1.getValue().getMarks()>o2.getValue().getMarks()) {
			return 1;
		}else
			return -1 ;
	}

	

	

}
