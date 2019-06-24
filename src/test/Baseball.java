package test;

import java.util.Scanner;

/*
* 숫자는 맞지만, 위치가 틀렸을 때는 볼
* 숫자와 위치가 모두 맞을 때는 스트라이크
* 숫자와 위치가 모두 틀렸을 때는 아웃
예를 들어, 아래의 경우가 있으면

A : 123
B : 1스트라이크 1볼.
A : 356
B : 1스트라이크 0볼.
A : 327
B : 2스트라이크 0볼.
A : 489
B : 0스트라이크 1볼.
이때 가능한 답은 324와 328 두 가지입니다.
 */
public class Baseball {
	public static void main(String[] args) {
		System.out.println("야구게임! 임의의 수 설정합니다.");
		int[] num = new int[3];// 입력한 숫자
		int[] ran = new int[3];// 자동 수
		int strike = 0;
		int ball = 0;
		int cnt = 0;
		// 자동 수 설정하고 중복 제거
		for (int i = 0; i < ran.length; i++) {
			ran[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (ran[i] == ran[j]) {
					i--;
				}
			}
		}
		while (true) {
			/*
			 * for (int i = 0; i < ran.length; i++) { 
			 * 		System.out.print(ran[i] + " "); 
			 * }
			 */
			System.out.println();
			System.out.println("중복되지않는 숫자 3개를 입력하세요.");
			// 숫자 입력
			Scanner scan = new Scanner(System.in);
			for (int i = 0; i < num.length; i++) {
				num[i] = scan.nextInt();
			}

			for (int i = 0; i < num.length; i++) {
				if (num[i] == ran[i]) {
					strike++;
				}
				for (int j = 0; j < num.length; j++) {
					if (i != j && ran[i] == num[j]) {
						ball++;
					}
				}
			}
			cnt++;
			System.out.println(strike + "스트라이크" + ball + "볼");

			if (strike == 3) {
				System.out.println(cnt+"번 만에 성공! 게임 끝!");
				break;
			}
			strike = 0;
			ball = 0;
		}

	}
}
