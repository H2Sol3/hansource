package test;
import java.util.Scanner;

/*
 * 
1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.

�Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.
(1�� �Ҽ��� �ƴմϴ�.)

���� ����
n�� 2�̻� 1000000������ �ڿ����Դϴ�.
����� ��
n	result
10	4
5	3
����� �� ����
����� �� #1
1���� 10 ������ �Ҽ��� [2,3,5,7] 4���� �����ϹǷ� 4�� ��ȯ

����� �� #2
1���� 5 ������ �Ҽ��� [2,3,5] 3���� �����ϹǷ� 3�� ��ȯ
 */
public class Test {

	public static void main(String[] args) {
	/*	int cnt = 0;
		int check;*/
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
/*		while (num <= 2 || num >= 1000000) {
			System.out.println("�ٽ� �Է��ϼ���");
			System.out.print("���ڸ� �Է��ϼ��� : ");
			num = scan.nextInt();
		}
        for(int i=2; i<=num; i++) // 1�� �Ҽ��� �ƴϹǷ� 2���� ����
        {
            for(int j=2; j<=i; j++)
            {
                 if(i%j ==0) 
                 {
                      cnt++;
                 }    
            }
            
            // �Ҽ��� 1�� �ڱ��ڽ����θ� �������Ƿ� �ڱ��ڽ����� �ѹ��� �������� �Ҽ�
            if(cnt==1)
            {
                 System.out.println(i);
            }
            cnt=0;
        }*/
	/*	/////////////////////////////////////
		System.out.println("���ڸ� �Է��ϼ���");
		
		for(int i=2; i <= num; i++) {
			for(int j=2;j<=i;j++) {
				if(i%j == 0) {
					cnt++;
				}
			}
			if(cnt == 1) {
				System.out.println(i+"�� �Ҽ� �Դϴ�.");
			}
			cnt = 0;
		}*/
		System.out.println(sosu(num));
        
	}
	
	public static int sosu(int num) {
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		while (num <= 2 || num >= 1000000) {
			System.out.println("�ٽ� �Է��ϼ���");
			System.out.print("���ڸ� �Է��ϼ��� : ");
			num = scan.nextInt();
		}
        for(int i=2; i<=num; i++) // 1�� �Ҽ��� �ƴϹǷ� 2���� ����
        {
            for(int j=2; j<=i; j++)
            {
                 if(i%j ==0) 
                 {
                      cnt++;
                 }    
            }
            
            // �Ҽ��� 1�� �ڱ��ڽ����θ� �������Ƿ� �ڱ��ڽ����� �ѹ��� �������� �Ҽ�
            if(cnt==1)
            {
                 System.out.println(i+"�� �Ҽ� �Դϴ�.");
            }
            cnt=0;
        }
		return 0;
	}
}
/*
class Sosu {
	public int so(int num) {
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		while (num <= 2 || num >= 1000000) {
			System.out.println("�ٽ� �Է��ϼ��� : ");
			num = scan.nextInt();
		}
		for(int i=2; i <= num; i++) {
			for(int j=2;j<=i;j++) {
				if(i%j == 0) {
					cnt++;
				}
			}
			if(cnt == 1) {
				System.out.println(i+"�� �Ҽ� �Դϴ�.");
			}
			cnt = 0;
		}
		return 0;
	}
}

*/












