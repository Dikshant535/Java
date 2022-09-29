package com.qsn2;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class StudentMarksComp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getMarks()>o2.getMarks())
			return 1;
		else
			return -1;
	}

	

}
