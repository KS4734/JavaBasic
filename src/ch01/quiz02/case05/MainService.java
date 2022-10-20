package ch01.quiz02.case05;

import java.util.Scanner;


public class MainService {
	
	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	
	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택: ");
		return sc.nextInt();
	}

	public void input(Member[] m, Score[] s) {
		if (cnt == m.length) {
			System.out.println("입력할 공간이 없습니다.");
		} else {
			m[cnt] = new Member();
			System.out.print("이름 입력: ");
			m[cnt].setName(sc.next());
			System.out.print("나이 입력: ");
			m[cnt].setAge(sc.nextInt());
			System.out.print("이메일 입력: ");
			m[cnt].setEmail(sc.next());
			
			s[cnt] = new Score();
			System.out.print("국어 점수 입력: ");
			s[cnt].setKor(sc.nextInt());
			System.out.print("영어 점수 입력: ");
			s[cnt].setEng(sc.nextInt());
			System.out.print("수학 점수 입력: ");
			s[cnt].setMath(sc.nextInt());
			
			s[cnt].setSum();
			s[cnt].setAvg();
			
			cnt++;
		}
	}

	public void output(Member[] m, Score[] s) {
		for (int i=0; i<cnt; i++) {
			System.out.println("### "+m[i].getName()+" ###");
			System.out.println("총점: " + s[i].getSum());
			System.out.println("평균: " + s[i].getAvg());
		}
	}
	
	
}
