package test;

/*
 * �𷡽ð� �� �����
 *     *
 *    ***
 *   *****
 *  *******
 */
public class SandStar {
	public static void main(String[] args) {
		char s = '*';
		char b = ' ';
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		for (int i = 0; i < 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(s);
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		for (int i = 0; i < 4; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print(b);
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print(s);
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k <= i; k++) { // ������
				System.out.print(b);
			}
			for (int j = 7; j > i * 2 + 2; j--) {
				System.out.print(s);
			}
			System.out.println();
		}

		/*
		 * for(int i=0;i<4;i++) { for(int j=3;j<0;j--) { //������� System.out.print(b); }
		 * for(int k=1;k<9;k++) { //*��� System.out.print(s); k++; }
		 * System.out.println(); }
		 */
		
	}
}







