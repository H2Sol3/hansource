package test;

import java.util.Scanner;

/*
 * ���� �߱�����
 */
public class Ball2 {

	public static void main(String[] args) {
		System.out.println("�߱����� ����");
		// �ߺ������ʴ� 1-9������ ������ �� 3�� �̱�
		int[] ball = new int[3];
		int[] num = new int[3];
		
		for(int i=0;i<ball.length;i++) {
			ball[i] = (int)(Math.random()*9)+1;
			for(int j=0;j<i;j++) {
				if(ball[i]==ball[j]) {
					i--;
				}
			}
		}
		for(int i : ball) {
			System.out.print(i+" ");
		}
		System.out.println();
		Scanner scan = new Scanner(System.in);
		// ����ڰ� ���� �Է�(��� �ߺ��� ���ڳ� 9�̻� �� �Է��ϸ� �ٽ� �Է��ϰ� �ؾ���)
		while(true) {
			int s = 0;
			int b = 0;
	//		int z = 0;
		System.out.println("�ߺ������ʴ� 1-9 ���� 3���� �Է��ϼ���");
		for(int i=0;i<num.length;i++) {
			num[i]=scan.nextInt();
		} //�ϴ� �ߺ������ʰ� �Է��ߴٰ� ġ��
		
		//�Է��� ���ڿ� ����� ���ڰ� �������� ��.
		/*
		 * 3 4 5
		 * 3 6 4
		 * 1s 1b 1z
		 */
		for(int i=0;i<ball.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(ball[i]==num[j]) {
					if(i==j) {
						s++;
					}else {
						b++;
					}
				} 
			}
		}
		
		System.out.println(s +"strike "+b+"ball "/*+z+"zero"*/);
		
		if(s==3) {
			System.out.println("�����Դϴ�!");
			break;
		}
		
		}
		
		
	}

}














