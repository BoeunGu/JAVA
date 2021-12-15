import java.util.*;

class Nation<String> {
	private String country;
	private String capital;

	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}

	public String getCountry() {
		return country;
	}

	public String getCapital() {
		return capital;
	}

}

public class Chapter7_11 {

	public static void main(String[] args) {
		int n = 10;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		Vector<Nation> v = new Vector<Nation>();
		v.add(new Nation("�׸���", "���׳�"));

		System.out.println("**** ���� ���߱� ������ �����մϴ�. ******");

		while (true) {
			System.out.println("�Է�:1, ����:2, ����:3 >>");
			int select = sc.nextInt();

			if (select == 3) {
				System.out.println("���α׷��� �����մϴ�..");
				break;
			}

			else if (select == 1) {

				while (true) {
					System.out.println("���� 9���� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
					System.out.println("����� ���� �Է� " + n+">>");
					String nation = sc.next();
					if (nation.equals("�׸�")) {
						break;
					}

					String cap = sc.next();
					v.add(new Nation(nation, cap));
					n++;

				}
			} else if (select == 2) {

				while (true) {
					int i = rd.nextInt(v.size());
					Nation result = v.get(i);
					result.getCapital();

					System.out.println(result.getCountry() + "�� ������?");
					String input = sc.next();

					if (input.equals("�׸�")) {
						System.out.println("���α׷��� �����մϴ�...");
						break;
					}
					if (result.getCapital().equals(input)) {
						System.out.println("����!");
					} else
						System.out.println("�ƴմϴ�!");

				}
			}

		}
sc.close();
	}
}