package ch01.quiz02.case01;

public class ScoreChild extends ScoreParent {
	// 필드
	private int music;
	private int physical;
	
	// getters, setters
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getPhysical() {
		return physical;
	}
	public void setPhysical(int physical) {
		this.physical = physical;
	}
	
	@Override
	public void setSum() {
		sum = super.getSum() + music + physical;
	}
	
	@Override
	public void setAvg() {
		avg = sum / 5.0;
	}
	
	@Override
	public String toString() {
		String msg = "### " + super.getName() + " ###\n";
		msg += "총점: " + sum + "\n";
		msg += "평균: " + avg + "\n";
		return msg;
	}
}
