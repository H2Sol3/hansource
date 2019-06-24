package test;

import java.util.Scanner;

//1~100까지 합
public class Sum {

	public static void main(String[] args) {
		System.out.println("1-100까지의 합 구하기");
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		sum=0;
		// 입력한 숫자만큼 합 구하기
		System.out.println("숫자 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}