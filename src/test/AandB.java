package test;

import java.util.Scanner;
//�� �� ���ϱ�
public class AandB {
	public static void main(String[] args) {
		System.out.println("���� �� ���ڸ� �Է��ϼ���.");
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
