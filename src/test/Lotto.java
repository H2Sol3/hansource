package test;

//�ζǹ�ȣ ����
public class Lotto {

	public static void main(String[] args) {
		System.out.println("�ζǹ�ȣ �����ϱ�!");
		int[] lotto = new int[6]; // ��÷��ȣ 6�� ���� ����.
		int[] num = new int[6]; // ��ȣ�̾Ƽ� �����ϱ�.
		int tmp; // �����ϱ����ؼ� �ϳ� ����

		for (int i = 0; i < num.length; i++) { // num�迭�� ���� �ֱ����ؼ� �ݺ���
			num[i] = (int) (Math.random() * 45) + 1; // �����Լ��� ����ؼ� 1~45���� ���� �ֱ�

			for (int j = 0; j < i; j++) { // �ߺ����Ÿ� ���ؼ�
				if (num[j] == num[i]) {
					i--;
				}
			}
		}
		// ������� �����ϱ�
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<i;j++) {
				if (num[j] > num[i]) {
					tmp = num[j];
					num[j] = num[i];
					num[i] = tmp;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}










