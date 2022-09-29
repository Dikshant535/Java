package com.qsn3;

import java.util.Comparator;

public class MemCompDate implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		// TODO Auto-generated method stub
		return (o1.getMembershipEnddate().compareTo(o2.getMembershipEnddate()));
	}
	
	

}
