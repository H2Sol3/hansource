package test;

import java.util.Scanner;

public class BigSmall {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n]; //배열 크기 정함
		//for문으로 값 입력
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		//값 비교하기
		for(int i=0;i<n;i++) {
			for(int j=0;i<i;j++) {
				if(arr[i] > arr[j]) {
					
				}
			}
		}
	}

}
