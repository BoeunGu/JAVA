import java.util.*;

public class Chapter7_03 {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �̸��� �α��� �Է��ϼ���. (�� : Korea 5000)");

		while (true) {

			System.out.print("���� �̸�, �α� >>");
			String nation = sc.next();
			int pop = sc.nextInt();
			nations.put(nation, pop);

			if (nation.equals("�׸�"))
				
				break;
		}

		System.out.println("�α� �˻�>>");

		while (true) {
			String searchNation = sc.next();
			//boolean a =nations.containsKey(searchNation);
			if (searchNation.equals("�׸�"))
				break;

			int popu = nations.get(searchNation);
			Integer a= Integer.valueOf(popu);
			System.out.println(a);

			if (nations.get(searchNation)==null) {
				System.out.println(searchNation + "����� �����ϴ�.");
			} else {
				System.out.println(searchNation + "�� �α��� " + popu);
			}


		}
		sc.close();
	}
}
