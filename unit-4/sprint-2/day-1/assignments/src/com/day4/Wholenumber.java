package com.day4;

public class Wholenumber {
	int num ;
	void func() {
		if(num%2!=0&num>0) {
			System.out.println("Input: "+num+", "+"output: "+num);
		}else if(num<0) {
			System.out.println("Input: "+num+", "+"output: Error");
		}else if(num%2==0&num>0) {
			int ch = num;
			while(ch%10==0) {
				ch++;
			}
			System.out.println("Input: "+num+", "+"output: "+ch);
		}
	}
	public static void main(String[] args) {
		Wholenumber n = new Wholenumber();
		n.num=44;
		n.func();
		n.num=45;
		n.func();
		n.num=-5;
		n.func();
	}
}
