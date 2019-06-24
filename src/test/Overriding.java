package test;

import java.util.Scanner;

/*
 * 오버라이딩 예제
 */
class Oper {
	
	public void add(int x, int y) {
		 System.out.println(x+y);
	}
	
	public void add(int x, double y) {
		 System.out.println(x+y);
	}
	
	public void add(double x, int y) {
		 System.out.println(x+y);
	}
}

public class Overriding {
	public static void main(String[] args) {
		Oper oper = new Oper();
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		oper.add(a, b);
//		oper.add(3, 5.1);
//		oper.add(3.2, 5);
		System.out.println();
	}

}














