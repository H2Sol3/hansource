package test;

import java.util.Scanner;

/*
* ���ڴ� ������, ��ġ�� Ʋ���� ���� ��
* ���ڿ� ��ġ�� ��� ���� ���� ��Ʈ����ũ
* ���ڿ� ��ġ�� ��� Ʋ���� ���� �ƿ�
���� ���, �Ʒ��� ��찡 ������

A : 123
B : 1��Ʈ����ũ 1��.
A : 356
B : 1��Ʈ����ũ 0��.
A : 327
B : 2��Ʈ����ũ 0��.
A : 489
B : 0��Ʈ����ũ 1��.
�̶� ������ ���� 324�� 328 �� �����Դϴ�.
 */
public class Baseball {
	public static void main(String[] args) {
		System.out.println("�߱�����! ������ �� �����մϴ�.");
		int[] num = new int[3];// �Է��� ����
		int[] ran = new int[3];// �ڵ� ��
		int strike = 0;
		int ball = 0;
		int cnt = 0;
		// �ڵ� �� �����ϰ� �ߺ� ����
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
			System.out.println("�ߺ������ʴ� ���� 3���� �Է��ϼ���.");
			// ���� �Է�
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
			System.out.println(strike + "��Ʈ����ũ" + ball + "��");

			if (strike == 3) {
				System.out.println(cnt+"�� ���� ����! ���� ��!");
				break;
			}
			strike = 0;
			ball = 0;
		}

	}
}
