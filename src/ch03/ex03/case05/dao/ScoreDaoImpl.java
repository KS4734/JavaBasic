package ch03.ex03.case05.dao;

import ch03.ex03.case05.domain.Score;

public class ScoreDaoImpl implements ScoreDao{

	private Score[] scores;
	private int cursor;
	
	public ScoreDaoImpl(Score[] score) {
		this.scores = score;
	}
	
	@Override
	public void setScore(Score score) {
		this.scores[this.cursor++] = score;
	}

	@Override
	public Score[] getScore() {
		return this.scores;
	}

}
