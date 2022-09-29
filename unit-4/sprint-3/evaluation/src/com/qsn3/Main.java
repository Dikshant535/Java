package com.qsn3;

public class Main {
	
	public void messageToStudents(Evaluation evaluation) {
		
		if(evaluation instanceof DsaEvaluation ) {
			
			System.out.println("Its a DSA Evaluation");
			evaluation.printNoOfQuestions();
			evaluation.evaluationTiming();
			System.out.println("========================================");
			
		}else {
			
			System.out.println("Its a Coding Evaluation");
			evaluation.printNoOfQuestions();
			evaluation.evaluationTiming();
			System.out.println("========================================");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Main m = new Main();
		
		m.messageToStudents(new DsaEvaluation(5)); 
		m.messageToStudents(new CodingEvaluation(4));
		
	}

}
