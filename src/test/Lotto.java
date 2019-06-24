package test;

//로또번호 생성
public class Lotto {

	public static void main(String[] args) {
		System.out.println("로또번호 생성하기!");
		int[] lotto = new int[6]; // 당첨번호 6개 넣을 공간.
		int[] num = new int[6]; // 번호뽑아서 정렬하기.
		int tmp; // 정렬하기위해서 하나 선언

		for (int i = 0; i < num.length; i++) { // num배열에 숫자 넣기위해서 반복문
			num[i] = (int) (Math.random() * 45) + 1; // 랜덤함수를 사용해서 1~45까지 숫자 넣기

			for (int j = 0; j < i; j++) { // 중복제거를 위해서
				if (num[j] == num[i]) {
					i--;
				}
			}
		}
		// 순서대로 정렬하기
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<i;j++) {
				if (num[j] > num[i]) {
					tmp = num[j];
					num[j] = num[i];
					num[i] = tmp;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}










