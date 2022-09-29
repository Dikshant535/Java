
public class Main {
	
	public static void runScored(int one, int two,int three, int four,int six) {
		int total =0;
		total +=(1*one)+(2*two)+(3*three)+(4*four)+(6*six);
		System.out.println("Total score by batsman :" + total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runScored(1,2,2,1,2);
	}

}
