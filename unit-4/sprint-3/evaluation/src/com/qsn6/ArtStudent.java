package com.qsn6;

public class ArtStudent implements Student{
	
	
	public ArtStudent(int hindiMarks, int englishMarks, int historyMarks) {
		super();
		this.hindiMarks = hindiMarks;
		this.englishMarks = englishMarks;
		this.historyMarks = historyMarks;
	}


	private int hindiMarks; 
	private int englishMarks; 
	private int historyMarks;
	
	public int getHindiMarks() {
		return hindiMarks;
	}
	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}
	
	
	public int getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}
	
	
	public int getHistoryMarks() {
		return historyMarks;
	}
	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}
	
	
	@Override
	public double findPercentage() {

		double tot = this.getHindiMarks()+this.getHistoryMarks()+this.getEnglishMarks();
		double per =  (tot/300)*100;
		return per;
	}
	
	
	
}
