package test;
//1-100까지 곱
// i = 0이랑 sum=0을 조심하기. 0을 곱하면 무조건 0이니깐!
public class Mul {
	public static void main(String[] args) {
		int sum=1;
		for(int i=1;i<=5;i++) {
			sum*=i;
		}
		System.out.println(sum);
	}

}
