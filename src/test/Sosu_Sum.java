package test;

import java.util.Scanner;

/*
2���� N������ ��� �Ҽ��� ���� ���ϼ���.
N�� 7�̶�� {2,3,5,7} = 17�� ��� �Ͻø� �˴ϴ�.
N�� ������ 2�̻� 10,000,000���� �Դϴ�.
ȿ���� �׽�Ʈ�� ��� �ð� ������ 1���Դϴ�.
 */
public class Sosu_Sum {
	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i = 2;i<=num;i++) {
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt == 1) {
				sum+=i;
				System.out.println(i);
			}
			cnt=0;
		}
		System.out.println("�Ҽ��� ��:"+sum);
	}
}







