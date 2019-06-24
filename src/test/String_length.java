package test;

import java.util.Scanner;

/*
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

제한사항
s는 길이가 1 이상, 100이하인 스트링입니다.

입출력 예
s	return
abcde	c
qwer	we
 */
public class String_length {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String s = scan.nextLine();
		
			if(s.length()%2 != 0) {
				char ch = s.charAt(s.length()/2);
				System.out.println(ch);
			} else {
				char ch2 = s.charAt(s.length()/2-1);
				System.out.print(ch2);
				char ch3 = s.charAt(s.length()/2);
				System.out.println(ch3);
			}
		
	}

}














