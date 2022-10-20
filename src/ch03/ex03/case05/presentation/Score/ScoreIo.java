package ch03.ex03.case05.presentation.Score;

import ch03.ex03.case05.domain.Score;
import ch03.ex03.case05.presentation.Console;
import ch03.ex03.case05.service.score.ScoreService;

public class ScoreIo {

	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void run(int studentCount) {
		Console.showInfo("점수입력을 시작합니다.");
		
		Score score = null;
		for (int i=0; i < studentCount; i++) {
			Console.showInfo((i+1) + "번째 학생 입니다.");
			
			score = new Score();
			score.setScoreNo((i+1));
			score.setKoreanScore(Console.inNumber("국어"));
			score.setEnglishScore(Console.inNumber("영어"));
			score.setMathScore(Console.inNumber("수학"));
			
			scoreService.addScore(score);
		}
		
		Console.showInfo("점수 입력이 끝났습니다.");
		this.printScores();
	}
	
	private void printScores() {
		Score[] scores = scoreService.listScore();
		
		Console.showInfo("번호 국어 영어 수학 합계 평균");
		System.out.println("--------------------------");
		
		for (Score score : scores) {
			Console.showInfo(score);
		}
	}
}
