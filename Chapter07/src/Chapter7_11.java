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
		v.add(new Nation("그리스", "아테네"));

		System.out.println("**** 수도 맞추기 게임을 시작합니다. ******");

		while (true) {
			System.out.println("입력:1, 퀴즈:2, 종료:3 >>");
			int select = sc.nextInt();

			if (select == 3) {
				System.out.println("프로그램을 종료합니다..");
				break;
			}

			else if (select == 1) {

				while (true) {
					System.out.println("현재 9개의 나라와 수도가 입력되어 있습니다.");
					System.out.println("나라와 수도 입력 " + n+">>");
					String nation = sc.next();
					if (nation.equals("그만")) {
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

					System.out.println(result.getCountry() + "의 수도는?");
					String input = sc.next();

					if (input.equals("그만")) {
						System.out.println("프로그램을 종료합니다...");
						break;
					}
					if (result.getCapital().equals(input)) {
						System.out.println("정답!");
					} else
						System.out.println("아닙니다!");

				}
			}

		}
sc.close();
	}
}