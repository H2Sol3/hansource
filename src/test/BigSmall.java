package test;

import java.util.Scanner;

public class BigSmall {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n]; //�迭 ũ�� ����
		//for������ �� �Է�
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		//�� ���ϱ�
		for(int i=0;i<n;i++) {
			for(int j=0;i<i;j++) {
				if(arr[i] > arr[j]) {
					
				}
			}
		}
	}

}
