package test;

import java.util.Scanner;
/*
 * ���μ�����
 * ���� N�� �־����� ��, ���μ������ϴ� ���α׷��� �ۼ��Ͻÿ�.
      ���μ��� �Ҽ��� �μ�(���)�� �ǹ��Ѵ�.
 ���� �Է�1
72

���� ���1
2 
2 
2 
3 
3 

���� �Է� 2
9991

���� ���2
97
103
 */
public class Soinsu {
	public static void main(String[] args) {
/*		System.out.println("���μ����� ���α׷��Դϴ�. ������ �Է��ϼ���.");
		//�Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //�Է¹��� ����
		int soinsu = 0; // ���μ�, ��
		
		//�Է¹��� ���� ������.
		// �ϴ� �Ҽ� ������ �˰����� ���� �ۼ��ϰ� ���� �Ҽ��� �����⸦ �ؾ��ϳ�?
		
		for(int i = 2; i<=num; i++) {
			if(num%i == 0) {
				soinsu = i; 
				num/=i;
				System.out.println(soinsu);
				i--;
			}
		}*/
		String s ="";
		String[] a = {"��","ȭ","��","��","��"};
		for(int i=0;i<a.length;i++) {
			if(a[i]=="ȭ") {
				s = "������"+i+"����";
			}
		}
		System.out.println(s);
	}

}


















