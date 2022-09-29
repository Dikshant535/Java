package com.qsn3;

import java.util.concurrent.Callable;

public class MyCall implements Callable<Integer>{
	
	int num ;
	int pro =1;
	
	
	public MyCall(int num) {
		super();
		this.num = num;
	}




	@Override
	public Integer call() throws Exception {
		for(int i=1;i<=num;i++) {
			
			pro = pro*i ;
			
		}
		return pro;
	}

}
