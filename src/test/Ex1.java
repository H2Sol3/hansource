package test;

/**
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		int n = 154;
		int sum = 0;
		int[] num=new int[3];
		for(int i=0;i<num.length;i++) {
			if(n>=100) {
				num[i]=n/100;
				n%=100;
			} else if(n>=10 && n<100) {
				num[i]=n/10;
				n%=10;
			} else {
				num[i]=n/1;
			}
		}
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		System.out.println(sum);
	}

}
