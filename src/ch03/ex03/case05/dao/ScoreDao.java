package ch03.ex03.case05.dao;

import ch03.ex03.case05.domain.Score;

public interface ScoreDao {

	void setScore(Score score);
	Score[] getScore();
}
