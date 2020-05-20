package test;

public class Ex {

	public static void main(String[] args) {

		for(int i =3; i<4; i++) {
			for(int j=1;j<=9;j++) {
				if((i*j)%4==0) {
					j++;
				}
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
	}

}
