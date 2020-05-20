package test;

import java.util.Scanner;
/*
 * 소인수분해
 * 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
      소인수란 소수인 인수(약수)를 의미한다.
 예제 입력1
72

예제 출력1
2 
2 
2 
3 
3 

예제 입력 2
9991

예제 출력2
97
103
 */
public class Soinsu {
	public static void main(String[] args) {
/*		System.out.println("소인수분해 프로그램입니다. 정수를 입력하세요.");
		//입력받기
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //입력받은 숫자
		int soinsu = 0; // 소인수, 몫
		
		//입력받은 숫자 나누기.
		// 일단 소수 나누는 알고리즘을 먼저 작성하고 나온 소수로 나누기를 해야하나?
		
		for(int i = 2; i<=num; i++) {
			if(num%i == 0) {
				soinsu = i; 
				num/=i;
				System.out.println(soinsu);
				i--;
			}
		}*/
		String s ="";
		String[] a = {"월","화","수","목","금"};
		for(int i=0;i<a.length;i++) {
			if(a[i]=="화") {
				s = "오늘은"+i+"요일";
			}
		}
		System.out.println(s);
	}

}


















