package test;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		System.out.println("성적계산기! 성적을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String grade;
		switch(num/10) {
		case 9:
			grade="A";
			break;
		case 8:
			grade="B";
			break;
		case 7:
			grade="C";
			break;
		case 6:
			grade="D";
			break;
		default:
			grade="F";
			break;
			
		}
		System.out.println("성적은 "+grade+" 입니다.");
		
	}

}
