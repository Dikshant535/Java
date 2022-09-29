package com.qsn3;

public abstract class Evaluation {
	
	private final int numberOfQuestions; 
	
	public int getNumberOfQuestions() {
		
		return numberOfQuestions;
		
	}
	
	abstract void evaluationTiming(); 
	
	void printNoOfQuestions(){ 
		
		System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions); 
		
	}
	
	public Evaluation(int n) {
		
		super();
		this.numberOfQuestions = n ;
		
	}
	
}
