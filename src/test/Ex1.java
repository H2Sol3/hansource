package test;

/**
 * �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
 * ������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.
 */

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���.");
		int n = 154;
		int sum = 0;
		int[] num=new int[3];
		for(int i=0;i<num.length;i++) {
			if(n>=100) {
				num[i]=n/100;
				n%=100;
			} else if(n>=10 && n<100) {
				num[i]=n/10;
				n%=10;
			} else {
				num[i]=n/1;
			}
		}
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		System.out.println(sum);
	}

}
