import java.util.*;

class Student {
	private int id;
	private String tel;

	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}
}

public class HashMapStudentEx {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("A", new Student(1, "010-1111-1111"));
		map.put("B", new Student(2, "010-2222-2222"));
		map.put("C", new Student(3, "010-3333-3333"));

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("�˻��� �̸�?");
			String name = sc.nextLine();
			if (name.equals("exit"))
				break;

			Student student = map.get(name);

			if (student == null)
				System.out.println(name + "�� ���� ����Դϴ�.");
			else
				System.out.println("id" + student.getId() + ", ��ȭ: " + student.getTel());

		}
		sc.close();
	}

}
