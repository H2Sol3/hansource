package test;

import java.util.Scanner;
//두 수 비교하기
public class AandB {
	public static void main(String[] args) {
		System.out.println("비교할 두 숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
	}

}
