package test;

abstract class Shape2 {
	/*
	 * private int x,y; public void move(int x, int y) { this.x=x; this.y=y; }
	 */
	abstract void area(int x, int y);

	abstract void draw();
}

class Rect extends Shape2 {
	private int x, y;

	@Override
	void draw() {
		System.out.println("사각형그리기");
	}

	@Override
	public void area(int x, int y) {
		System.out.println(x+"*"+y+"="+x*y);
	}

}

public class Shape {
	public static void main(String[] args) {
		Rect rect = new Rect();
		rect.draw();
		rect.area(3, 4);
	}
}
