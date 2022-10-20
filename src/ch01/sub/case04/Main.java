package ch01.sub.case04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		User u = new User();
		
		System.out.print("아이디 입력: ");
		u.setId(sc.next());
		System.out.print("비밀번호 입력: ");
		u.setPw(sc.next());
		System.out.print("이름 입력: ");
		u.setName(sc.next());
		System.out.print("나이 입력: ");
		u.setAge(sc.nextInt());
		System.out.print("이메일 입력: ");
		u.setEmail(sc.next());
		
		System.out.println(u.toString());
	}
}
