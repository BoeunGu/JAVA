import java.util.*;

public class Chapter7_07 {

	public static void main(String[] args) {
		HashMap<String,Double> map = new HashMap<String,Double>();
		int count=0;
		System.out.println("미래장학금 관리시스템입니다.");
		
		
		Scanner sc = new Scanner(System.in);
		while(count<5) {
			System.out.println("이름과 학점 >> ");
			String name =sc.next();
			double grade=sc.nextDouble();
			
			map.put(name,grade);
			count++;
		}
		Set<String> keys = map.keySet();
		Iterator<String> it =keys.iterator();
		
		System.out.println("장학생 선발 학점 기준 입력");
		double de=sc.nextDouble();
		System.out.print("장학생 명단 :" );
		
		while(it.hasNext()) {
			String keyname = it.next();
			double result =map.get(keyname);
			
			if(result>de) {
				System.out.print(keyname+" ");
			}
		}

 	}

}
