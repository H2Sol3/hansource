package test;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. 
 * n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. 
 * ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.
 */
public class CodeTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] num = new int[6];
		int tmp;
		for(int i=0;i<=num.length-1;i++) {
			System.out.println((i+1)+"��° ���� �Է� : ");
			num[i]=scan.nextInt();
		}
		for(int a : num) {
			System.out.print(a);
		}
		System.out.println();
		for(int i=0;i<=num.length-1;i++) {
			for(int j =0;j<=i;j++) {
				if(num[i]>=num[j]) {
					tmp = num[j];
					num[j]=num[i];
					num[i]=tmp;
				}
			}
		}
		for(int a : num) {
			System.out.print(a);
		}
	}

}
