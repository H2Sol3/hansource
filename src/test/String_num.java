package test;

import java.util.Scanner;

/*
 * 다음에는 문자열에서 입력한 문자의 개수를 알려주는 코드도 만들어주시면 안될까요
예를들어 [문자열을 입력하세요]를 띄우고 사용자가 <apple> 입력하고 [개수 구하고자 하는 문자를 입력하세요]를 띄우고
 사용자가 <p>를 입력하면 출력값에서 "2개"가 나오는거요!
 */
public class String_num {
	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String str = scan.next(); // 문자열 입력받기
		System.out.println("갯수가 궁금한 문자를 입력하세요.");
		char s = scan.next().charAt(0); //문자 입력
		
		int cnt = 0; //갯수 세기위한 변수
		//1개 아닌 2개 입력했을떄 다시 입력하라는 문장 띄우기.
		
		
		//for문으로 입력한 문자열 확인
		for(int i =0 ;i <str.length(); i++) {
			char c = str.charAt(i);
			if(c == s) {
				cnt++;
			}
		}
		//없는 문자를 입력했을때
		
		
		System.out.println(cnt+"개");
	}

}

















