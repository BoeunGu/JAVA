//			Boeun Gu
//			latest edit: 18/11/21
class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}

}

public class Quiz7_18 {
	public static void action(Robot r) { // Robot r=new DanceRobot() : upcasting / ��� 'r'�� ��ĳ������ �Ǳ� ������ ���۷����� ��� ��ü��
											// ����Ű���� �˼� ����. �׷��� 'instanceof' �����ڸ� ����Ͽ� �з��Ѵ�.

		if (r instanceof DanceRobot) {
			DanceRobot s = (DanceRobot) r; // ���۷��� r�δ� DanceRobot�� ���� �Ҽ� ���⿡ DanceRobotŸ���� ���۷��� ������ downcasting�� �Ͽ�
											// dance()�Լ��� ���� �����ϴ�.
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
