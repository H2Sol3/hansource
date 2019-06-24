package test;
import java.util.Scanner;

/*
 * 
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.
입출력 예
n	result
10	4
5	3
입출력 예 설명
입출력 예 #1
1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

입출력 예 #2
1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
 */
public class Test {

	public static void main(String[] args) {
	/*	int cnt = 0;
		int check;*/
		System.out.print("숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
/*		while (num <= 2 || num >= 1000000) {
			System.out.println("다시 입력하세요");
			System.out.print("숫자를 입력하세요 : ");
			num = scan.nextInt();
		}
        for(int i=2; i<=num; i++) // 1은 소수가 아니므로 2부터 시작
        {
            for(int j=2; j<=i; j++)
            {
                 if(i%j ==0) 
                 {
                      cnt++;
                 }    
            }
            
            // 소수는 1과 자기자신으로만 나눠지므로 자기자신으로 한번만 나눠질때 소수
            if(cnt==1)
            {
                 System.out.println(i);
            }
            cnt=0;
        }*/
	/*	/////////////////////////////////////
		System.out.println("숫자를 입력하세요");
		
		for(int i=2; i <= num; i++) {
			for(int j=2;j<=i;j++) {
				if(i%j == 0) {
					cnt++;
				}
			}
			if(cnt == 1) {
				System.out.println(i+"는 소수 입니다.");
			}
			cnt = 0;
		}*/
		System.out.println(sosu(num));
        
	}
	
	public static int sosu(int num) {
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		while (num <= 2 || num >= 1000000) {
			System.out.println("다시 입력하세요");
			System.out.print("숫자를 입력하세요 : ");
			num = scan.nextInt();
		}
        for(int i=2; i<=num; i++) // 1은 소수가 아니므로 2부터 시작
        {
            for(int j=2; j<=i; j++)
            {
                 if(i%j ==0) 
                 {
                      cnt++;
                 }    
            }
            
            // 소수는 1과 자기자신으로만 나눠지므로 자기자신으로 한번만 나눠질때 소수
            if(cnt==1)
            {
                 System.out.println(i+"는 소수 입니다.");
            }
            cnt=0;
        }
		return 0;
	}
}
/*
class Sosu {
	public int so(int num) {
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		while (num <= 2 || num >= 1000000) {
			System.out.println("다시 입력하세요 : ");
			num = scan.nextInt();
		}
		for(int i=2; i <= num; i++) {
			for(int j=2;j<=i;j++) {
				if(i%j == 0) {
					cnt++;
				}
			}
			if(cnt == 1) {
				System.out.println(i+"는 소수 입니다.");
			}
			cnt = 0;
		}
		return 0;
	}
}

*/












