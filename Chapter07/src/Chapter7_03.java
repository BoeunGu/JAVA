import java.util.*;

public class Chapter7_03 {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("나라 이름과 인구를 입력하세요. (예 : Korea 5000)");

		while (true) {

			System.out.print("나라 이름, 인구 >>");
			String nation = sc.next();
			int pop = sc.nextInt();
			nations.put(nation, pop);

			if (nation.equals("그만"))
				
				break;
		}

		System.out.println("인구 검색>>");

		while (true) {
			String searchNation = sc.next();
			//boolean a =nations.containsKey(searchNation);
			if (searchNation.equals("그만"))
				break;

			int popu = nations.get(searchNation);
			Integer a= Integer.valueOf(popu);
			System.out.println(a);

			if (nations.get(searchNation)==null) {
				System.out.println(searchNation + "나라는 없습니다.");
			} else {
				System.out.println(searchNation + "의 인구는 " + popu);
			}


		}
		sc.close();
	}
}
