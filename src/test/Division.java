package test;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		
		System.out.println("1+2+3 = " + sum);
		
		/*System.out.println("양의 정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i =1;i<=num;i++){
			if(num%i==0){
				System.out.print(i+" ");
			}
		}
		System.out.println();*/

	}

}

class Calculator {
	public int evaluate(String expression) {
		int sum = 0;
		int[] num = new int[5];
		for(int i=0;i<expression.length();i++) {
			num[i]=expression.charAt(i);
		/*	if(num[i]==0) {
				
			}*/
			i++;
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		return sum;
	}
}











