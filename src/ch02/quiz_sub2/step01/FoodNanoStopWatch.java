package ch02.quiz_sub2.step01;

public class FoodNanoStopWatch {

	long startTime;
	long endTime;
	
	public double getElapsedTime() {
		return (double)(endTime - startTime) / 1000000000;
	}
	
	public static void main(String[] args) {
		
		FoodNanoStopWatch f = new FoodNanoStopWatch();
		
		f.startTime = System.nanoTime();
		
		for (long i = 0 ; i<300_000_000_000L; i++) {
			
		}
		
		f.endTime =  System.nanoTime();
		
		double elapsedTime = f.getElapsedTime();
		System.out.printf("경과 시간: %.11f", elapsedTime);
	}
}
