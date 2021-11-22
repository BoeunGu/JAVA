//			Boeun Gu
//			latest edit: 22/11/21

abstract class Shape1 {
	
	Point p;

	Shape1() {
		this(new Point(0, 0));
	}

	Shape1(Point p) {
		this.p = p;
	}

	abstract double calcArea();

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Circle1 extends Shape1 {
	double r;

	Circle1(double r) {
		super();			//추상클래스도 부모클래스여서 생성자를 만들어 주어야한다. super();
		this.r = r;

	}

	double calcArea() {
		return r * r * Math.PI;
	}

}

class Rectangle1 extends Shape1 {
	double width;
	double height;

	Rectangle1(int width, int height) {
		super();
		this.width = width;
		this.height = height;

	}

	double calcArea() {
		return width * height;
	}
	boolean isSquare() {
		return width == height;

	}

}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "{" + x + "," + y + "}";
	}
}

public class Quiz7_22 {

	static double sumArea1(Shape1[] arr){
		double hap=0;
		for(int i=0; i<arr.length;i++) {
			hap +=arr[i].calcArea();
			
		}return hap;
	}
	public static void main(String[] args) {
		
		
		Shape1[] arr1= {new Circle1(5.0), new Rectangle1(3,4), new Circle1(1)};
		System.out.println("면적의 합 :"+sumArea1(arr1));
		

	}
}

