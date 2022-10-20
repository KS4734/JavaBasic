package ch02.quiz_sub2.step01;

public class FootMilliWatch {

	long startTime;
	long endTime;
	
	public double getElapsedTime() {
		return (double)(endTime - startTime) / 1000000000;
	}
	
	public static void main(String[] args) {
		
		FootMilliWatch f = new FootMilliWatch();
		
		f.startTime = System.currentTimeMillis();
		
		for (long i = 0 ; i<300_000_000_000L; i++) {
			
		}
		
		f.endTime =  System.currentTimeMillis();
		
		double elapsedTime = f.getElapsedTime();
		System.out.printf("경과 시간: %.11f", elapsedTime);
	}
}
