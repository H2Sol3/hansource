package test;

public class MathTest {
	public static void main(String[] args) {
		System.out.println("������ ��󳻱�");
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int[] man1= {1,2,3,4,5};
		int[] man2= {2,1,2,3,2,4,2,5};
		int[] man3= {3,3,1,1,2,2,4,4,5,5};
		int[] answer = new int[10000];
		for(int i=0;i<answer.length;i++) { //����
			answer[i]=(int)(Math.random()*5)+1;
		}
		for(int i=0;i<answer.length;i++) {
			for(int j=0;j<man1.length;j++) {
				if(answer[i]==man1[j]) {
					cnt1++;
				}
			}
		}
		System.out.println("DD "+cnt1);
		for(int i=0;i<answer.length;i++) {
			for(int j=0;j<man2.length;j++) {
				if(answer[i]==man2[j]) {
					cnt2++;
				}
			}
		}
		for(int i=0;i<answer.length;i++) {
			for(int j=0;j<man3.length;j++) {
				if(answer[i]==man3[j]) {
					cnt3++;
				}
			}
		}
		if(cnt1>cnt2 && cnt1>cnt3) {
			System.out.println("���� ���� ���� ����� 1��������.");
		}/* else if(cnt2>cnt1&&cnt2>cnt3) {
			System.out.println("������2");
		} else if(cnt3>cnt1&&cnt3>cnt2) {
			System.out.println("������3");
		}*/
	}

}
/*
 * �����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. 
 * �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.

1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, 
���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.
����� ��
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
����� �� ����
����� �� #1

������ 1�� ��� ������ �������ϴ�.
������ 2�� ��� ������ Ʋ�Ƚ��ϴ�.
������ 3�� ��� ������ Ʋ�Ƚ��ϴ�.
���� ���� ������ ���� ���� ����� ������ 1�Դϴ�.

����� �� #2

��� ����� 2�������� ������ϴ�.
 */