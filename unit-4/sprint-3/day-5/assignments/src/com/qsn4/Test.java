package com.qsn4;

public class Test implements Intr{

	@Override
	public int[] display(int p) {
		int[] arr = new int[p];
		for(int i=1;i<=p;i++) {
			int flag =0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					flag++;
				}
			}
			if(flag==2){
				arr[i-1]=i;
			}
		}
		
		return arr;
		
	}

}
