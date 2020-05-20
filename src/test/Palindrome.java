/*
Input: 12345

Output: False


Input: -101

Output: False


Input: 11111

Output: True

 */
package test;
//import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		int num = 11111;
		System.out.println("입력된 숫자:11111");
		int [] num2=new int[5];
		for(int i=0;i<5;i++) {
			if(num>10000) {
				num2[i]=num/10000;
				num%=10000;				
			} else if(num>1000) {
				num2[i]=num/1000;
				num%=1000;
			} else if(num>100) {
				num2[i]=num/100;
				num%=100;
			} else if(num>10) {
				num2[i]=num/10;
				num%=10;
			}  else {
				num2[i]=num;
			}
		}
		System.out.println(tureorfalse(num2));
		}
	
	public static boolean tureorfalse(int[] num) {
		int cnt = 0;
		for(int i=0;i<=1;i++) {
			if(num[i]==num[num.length-1-i]) {
				cnt++;
			}
		}
		if(cnt==2) {
			return true;
		} else {
			return false;
		}
	}
}






