package test;

//�ζǹ�ȣ ����
public class Lotto {
	public static void main(String[] args) {
		System.out.println("�ζǹ�ȣ ����");
		int[] num = new int[45];
		int[] lotto = new int[6];
		
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*45)+1;
			//�ߺ�����
			for(int j=0;j<i;j++) {
				if(num[i]==num[j]) {
					i--;					
				}
			}
		}
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=num[i];
		}
		//����
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<i;j++) {
				if(lotto[i]<lotto[j]) {
					int tmp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=tmp;
				}
			}
		}
		
		for(int l:lotto) {
			System.out.print(l+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println("�ζǹ�ȣ �����ϱ�!");
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
		}*/
		
		
		
		
		
		
		
		
		
		
	/*	
		
		
	
		System.out.println("�ζǹ�ȣ ���");
		int [] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
		
		//����
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<i;j++) {
				if(lotto[i]<lotto[j]) {
					int tmp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=tmp;
				}
			}
		}
		
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}*/
	}

}










