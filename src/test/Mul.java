package test;
//1-100���� ��
// i = 0�̶� sum=0�� �����ϱ�. 0�� ���ϸ� ������ 0�̴ϱ�!
public class Mul {
	public static void main(String[] args) {
		int sum=1;
		for(int i=1;i<=5;i++) {
			sum*=i;
		}
		System.out.println(sum);
	}

}
