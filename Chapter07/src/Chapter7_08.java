import java.util.*;

public class Chapter7_08 {

	public static void main(String[] args) {
		int totalpoint = 0;
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		System.out.println("** ����Ʈ ���� ���α׷��Դϴ�. **");

		while (true) {
			System.out.println("�̸��� ����Ʈ �Է� >>");
			String name = sc.next();
			if(name.equals("�׸�")){
				System.out.println("���α׷��� �����մϴ�..");
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