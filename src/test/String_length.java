package test;

import java.util.Scanner;

/*
�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.

���ѻ���
s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.

����� ��
s	return
abcde	c
qwer	we
 */
public class String_length {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		String s = scan.nextLine();
		
			if(s.length()%2 != 0) {
				char ch = s.charAt(s.length()/2);
				System.out.println(ch);
			} else {
				char ch2 = s.charAt(s.length()/2-1);
				System.out.print(ch2);
				char ch3 = s.charAt(s.length()/2);
				System.out.println(ch3);
			}
		
	}

}














