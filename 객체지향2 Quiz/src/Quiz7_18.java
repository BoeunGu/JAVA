//			Boeun Gu
//			latest edit: 18/11/21
class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}

}

public class Quiz7_18 {
	public static void action(Robot r) { // Robot r=new DanceRobot() : upcasting / 모두 'r'로 업캐스팅이 되기 때문에 레퍼런스가 어느 객체를
											// 가리키는지 알수 없다. 그래서 'instanceof' 연산자를 사용하여 분류한다.

		if (r instanceof DanceRobot) {
			DanceRobot s = (DanceRobot) r; // 레퍼런스 r로는 DanceRobot에 접근 할수 없기에 DanceRobot타입의 레퍼런스 변수로 downcasting을 하여
											// dance()함수에 접근 가능하다.
			s.dance();
		} else if (r instanceof SingRobot) {
			SingRobot d = (SingRobot) r;
			d.sing();
		} else if (r instanceof DrawRobot) {
			DrawRobot p = (DrawRobot) r;
			p.draw();
		}

	}

	public static void main(String[] args) {

		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };

		for (int i = 0; i < arr.length; i++)
			action(arr[i]);

	}

}
