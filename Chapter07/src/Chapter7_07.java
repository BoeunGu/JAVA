import java.util.*;

public class Chapter7_07 {

	public static void main(String[] args) {
		HashMap<String,Double> map = new HashMap<String,Double>();
		int count=0;
		System.out.println("�̷����б� �����ý����Դϴ�.");
		
		
		Scanner sc = new Scanner(System.in);
		while(count<5) {
			System.out.println("�̸��� ���� >> ");
			String name =sc.next();
			double grade=sc.nextDouble();
			
			map.put(name,grade);
			count++;
		}
		Set<String> keys = map.keySet();
		Iterator<String> it =keys.iterator();
		
		System.out.println("���л� ���� ���� ���� �Է�");
		double de=sc.nextDouble();
		System.out.print("���л� ��� :" );
		
		while(it.hasNext()) {
			String keyname = it.next();
			double result =map.get(keyname);
			
			if(result>de) {
				System.out.print(keyname+" ");
			}
		}

 	}

}
