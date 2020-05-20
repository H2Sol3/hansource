package test;

import java.util.Scanner;

/*
 * 간단 야구게임
 */
public class Ball2 {

	public static void main(String[] args) {
		System.out.println("야구게임 시작");
		// 중복되지않는 1-9까지의 임의의 수 3개 뽑기
		int[] ball = new int[3];
		int[] num = new int[3];
		
		for(int i=0;i<ball.length;i++) {
			ball[i] = (int)(Math.random()*9)+1;
			for(int j=0;j<i;j++) {
				if(ball[i]==ball[j]) {
					i--;
				}
			}
		}
		for(int i : ball) {
			System.out.print(i+" ");
		}
		System.out.println();
		Scanner scan = new Scanner(System.in);
		// 사용자가 숫자 입력(대신 중복된 숫자나 9이상 수 입력하면 다시 입력하게 해야함)
		while(true) {
			int s = 0;
			int b = 0;
	//		int z = 0;
		System.out.println("중복되지않는 1-9 숫자 3개를 입력하세요");
		for(int i=0;i<num.length;i++) {
			num[i]=scan.nextInt();
		} //일단 중복되지않게 입력했다고 치고
		
		//입력한 숫자와 출력한 숫자가 동일한지 비교.
		/*
		 * 3 4 5
		 * 3 6 4
		 * 1s 1b 1z
		 */
		for(int i=0;i<ball.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(ball[i]==num[j]) {
					if(i==j) {
						s++;
					}else {
						b++;
					}
				} 
			}
		}
		
		System.out.println(s +"strike "+b+"ball "/*+z+"zero"*/);
		
		if(s==3) {
			System.out.println("정답입니다!");
			break;
		}
		
		}
		
		
	}

}














