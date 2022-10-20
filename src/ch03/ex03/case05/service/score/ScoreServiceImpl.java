package ch03.ex03.case05.service.score;

import ch03.ex03.case05.dao.ScoreDao;
import ch03.ex03.case05.domain.Score;

public class ScoreServiceImpl implements ScoreService{

	private ScoreDao scoreDao;
	
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}

	@Override
	public void addScore(Score score) {
		this.scoreDao.setScore(score);
	}

	@Override
	public Score[] listScore() {
		Score[] scores = this.scoreDao.getScore();
		
		int sum = 0;
		int average = 0;
		for (Score score : scores) {
			sum = score.getKoreanScore() + score.getEnglishScore() + score.getMathScore();
			average = sum / 3;
			score.setSum(sum);
			score.setAverage(average);
		}
		return scores;
	}

	
}
