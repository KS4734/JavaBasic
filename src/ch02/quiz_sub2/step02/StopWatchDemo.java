package ch02.quiz_sub2.step02;

public class StopWatchDemo {
	public static void main(String[] args) {

		StopWatch s = new StopWatch();
		s.startNano();
		
		
		
		
		for (long i=0; i<30_000_000_000L; i++) {
			
		}
		
		s.stopNano();
		
		double elapsedTime = s.getElapsedTime();
	}

}
