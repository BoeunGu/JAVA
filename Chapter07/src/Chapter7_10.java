import java.util.*;

abstract class Shape {
	public Shape() {
	}

	abstract public void draw();

}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

public class Chapter7_10 {

	public static void main(String[] args) {
		Vector<Shape> v = new Vector<Shape>();
		Scanner sc = new Scanner(System.in);
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");

		while (true) {
			System.out.println("����(1), ����(2). ��κ���(3), ����(4) >>");
			int select = sc.nextInt();

			if (select == 4) {
				System.out.println("beauty�� �����մϴ�.");
				break;
			} 
			
			else if (select == 1) {
				System.out.println("Line(1), Rect(2), Circle(3)");
				int shape = sc.nextInt();

				if (shape == 1) {
					v.add(new Line());
				} else if (shape == 2) {
					v.add(new Rect());
				} else {
					v.add(new Circle());

				}
			}
			else if(select==2) {
				System.out.println("������ ������ġ");
				int del=sc.nextInt();
				v.remove(del-1);
			}
			else {
				Iterator<Shape> it=v.iterator();
				
				while(it.hasNext()) {
					Shape result=it.next();
					result.draw();
				}
			}

		}

	}
}