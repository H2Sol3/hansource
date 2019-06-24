package test;

import java.util.Scanner;

/*
 * * 찍기
 */
public class Star {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char star = '*';
		char blank = ' ';
		System.out.println("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println("유형을 선택하세요 (1,2,3) "); 
		int type = scan.nextInt();
		switch(type) {
			case 1: 
				// 기본 별 찍기
				for (int i = 0; i < num; i++) {
					for (int j = 0; j <= i; j++) {
						System.out.print(star);
					}
					System.out.println();
				} 
				break;
			case 2 :
				// 뒤집어서 찍기
				for (int i = 0; i < num; i++) {
					for (int j = num; j > i; j--) {
						System.out.print(star);
					}
					System.out.println();
				}
				break;
			case 3 :
				for (int i = 0; i < num; i++) {
					for(int k=1;k<num-i;k++) {
						System.out.print(blank);
					}
					for(int j =1;j<=i*2+1;j++) {
						System.out.print(star);
					}
					System.out.println();
			}
				break;
		}/*
		// 기본 별 찍기
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		System.out.println();
		// 뒤집어서 찍기
		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(star);
			}
			System.out.println();
		}
		System.out.println();
		// 이등변삼각형으로 찍기
		
		for (int i = 0; i < num; i++) {
				for(int k=1;k<num-i;k++) {
					System.out.print(blank);
				}
				for(int j =1;j<=i*2+1;j++) {
					System.out.print(star);
				}
				System.out.println();
		}
*/
	}

}












