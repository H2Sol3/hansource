package test;

import java.util.Scanner;

/*
 * �������� ���ڿ����� �Է��� ������ ������ �˷��ִ� �ڵ嵵 ������ֽø� �ȵɱ��
������� [���ڿ��� �Է��ϼ���]�� ���� ����ڰ� <apple> �Է��ϰ� [���� ���ϰ��� �ϴ� ���ڸ� �Է��ϼ���]�� ����
 ����ڰ� <p>�� �Է��ϸ� ��°����� "2��"�� �����°ſ�!
 */
public class String_num {
	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String str = scan.next(); // ���ڿ� �Է¹ޱ�
		System.out.println("������ �ñ��� ���ڸ� �Է��ϼ���.");
		char s = scan.next().charAt(0); //���� �Է�
		
		int cnt = 0; //���� �������� ����
		//1�� �ƴ� 2�� �Է������� �ٽ� �Է��϶�� ���� ����.
		
		
		//for������ �Է��� ���ڿ� Ȯ��
		for(int i =0 ;i <str.length(); i++) {
			char c = str.charAt(i);
			if(c == s) {
				cnt++;
			}
		}
		//���� ���ڸ� �Է�������
		
		
		System.out.println(cnt+"��");
	}

}

















