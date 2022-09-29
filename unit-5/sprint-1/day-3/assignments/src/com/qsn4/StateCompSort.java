package com.qsn4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StateCompSort implements Comparator<Map.Entry<String,List<String>>>{

	@Override
	public int compare(Entry<String, List<String>> o1, Entry<String, List<String>> o2) {
		// TODO Auto-generated method stub
		return o1.getKey().compareTo(o2.getKey());
	}

}
