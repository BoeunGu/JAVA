import java.util.*;

public class Chapter7_08 {

	public static void main(String[] args) {
		int totalpoint = 0;
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		System.out.println("** 포인트 관리 프로그램입니다. **");

		while (true) {
			System.out.println("이름과 포인트 입력 >>");
			String name = sc.next();
			if(name.equals("그만")){
				System.out.println("프로그램을 종료합니다..");
				break;
			}
			Integer point = sc.nextInt();

			if (map.containsKey(name)) {
				int pre = map.get(name);
				map.remove(name);
				totalpoint = pre + point;

				map.put(name, totalpoint);
			}

			else {
				map.put(name, point);
			}

			Set<String> keys = map.keySet();
			Iterator<String> it = keys.iterator();

			while (it.hasNext()) {
				String keyname = it.next();
				int valuepoint = map.get(keyname);
				System.out.print("(" + keyname + ", " + valuepoint + ")");
			}
			System.out.println("");

		}
		sc.close();
	}
}