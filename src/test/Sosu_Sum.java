package test;

import java.util.Scanner;

/*
2부터 N까지의 모든 소수의 합을 구하세요.
N이 7이라면 {2,3,5,7} = 17을 출력 하시면 됩니다.
N의 범위는 2이상 10,000,000이하 입니다.
효율성 테스트의 모든 시간 제한은 1초입니다.
 */
public class Sosu_Sum {
	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
		System.out.print("숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i = 2;i<=num;i++) {
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt == 1) {
				sum+=i;
				System.out.println(i);
			}
			cnt=0;
		}
		System.out.println("소수의 합:"+sum);
	}
}







