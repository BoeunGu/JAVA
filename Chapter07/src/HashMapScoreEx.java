import java.util.*;
public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String,Integer> scoreMap=new HashMap<String,Integer>();
		
		scoreMap.put("A",97);
		scoreMap.put("B",88);
		scoreMap.put("C",98);
		scoreMap.put("D",70);
		scoreMap.put("E",99);
		
		System.out.println("HashMap의 요소 개수 :"+ scoreMap.size());
		
		Set<String> keys = scoreMap.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name+ " : "+ score);
		}
	}

}
