package test;

import java.util.Scanner;

//1~100���� ��
public class Sum {

	public static void main(String[] args) {
		System.out.println("1-100������ �� ���ϱ�");
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		sum=0;
		// �Է��� ���ڸ�ŭ �� ���ϱ�
		System.out.println("���� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}