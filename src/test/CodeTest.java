package test;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. 
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */
public class CodeTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] num = new int[6];
		int tmp;
		for(int i=0;i<=num.length-1;i++) {
			System.out.println((i+1)+"번째 숫자 입력 : ");
			num[i]=scan.nextInt();
		}
		for(int a : num) {
			System.out.print(a);
		}
		System.out.println();
		for(int i=0;i<=num.length-1;i++) {
			for(int j =0;j<=i;j++) {
				if(num[i]>=num[j]) {
					tmp = num[j];
					num[j]=num[i];
					num[i]=tmp;
				}
			}
		}
		for(int a : num) {
			System.out.print(a);
		}
	}

}
