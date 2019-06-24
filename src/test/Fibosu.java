package test;

public class Fibosu {
	public static void main(String[] args) {
		System.out.println("피보나치 수열 1 1 2 3 5 8 13 ...");
		Fibo fibo = new Fibo();
		for(int i=0;i<=10;i++) {
			System.out.println(fibo.fibo(i));
		}
		
	}

/*	public static int Fibo(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return Fibo(n-2)+Fibo(n-1);
		}
	}*/
}
class Fibo {
	public int fibo(int n) {
		if(n<=1) {
			return 1;
		} else {
			return fibo(n-2)+fibo(n-1);
		}
	}
}