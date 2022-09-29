package com.day5;

public class A2 {
	void check(char ch) {
		if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u') {
			System.out.println("Character is Vowel !");
		}else if(ch=='b'|ch=='c'|ch=='d'|ch=='f'|ch=='g'|ch=='h'|ch=='j'|ch=='k'|ch=='l'|ch=='m'|ch=='n'|ch=='p'|ch=='q'|ch=='r'|ch=='s'|ch=='t'|ch=='z'|ch=='v'|ch=='w'|ch=='x'|ch=='y'){
			System.out.println("Character is Consonant");
		}else {
			System.out.println("Invalid Character !");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A2 a1 = new A2();
		char x ='a';
		a1.check(x);
		A2 a2 = new A2();
		char y = 'b';
		a2.check(y);
		A2 a3 =new A2();
		char z = 'A';
		a3.check(z);
		
	}

}
