package test;

import java.util.Scanner;

/*
 * * ���
 */
public class Star {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char star = '*';
		char blank = ' ';
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		System.out.println("������ �����ϼ��� (1,2,3) "); 
		int type = scan.nextInt();
		switch(type) {
			case 1: 
				// �⺻ �� ���
				for (int i = 0; i < num; i++) {
					for (int j = 0; j <= i; j++) {
						System.out.print(star);
					}
					System.out.println();
				} 
				break;
			case 2 :
				// ����� ���
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
		// �⺻ �� ���
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		System.out.println();
		// ����� ���
		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(star);
			}
			System.out.println();
		}
		System.out.println();
		// �̵�ﰢ������ ���
		
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












