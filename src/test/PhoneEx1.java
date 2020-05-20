package test;

class Phone {
	String color;
	String number;
	boolean power;
	
	void power() {
		power=!power;
	}
	void send(String num) {
		System.out.println(num+"으로 전화거는중!");
	}
	void send2() {
		
	}
}

public class PhoneEx1 {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.color="red";
		p1.number="01012345678";
		p1.power=true;
		System.out.println(p1.color+p1.number+p1.power);
		p1.power();
		
		p1.send("0102585895");
		p1.color="pink";
		p1.number="01012345678";
		p1.power=false;
		System.out.println(p1.color+p1.number+p1.power);
		Phone p2 = new Phone();
		p2.color="blue";
		p2.number="01012345678";
		p2.power=true;
		System.out.println(p2.color+p2.number+p2.power);
	}

}
