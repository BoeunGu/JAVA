import java.util.*;
public class Chapter7_01 {
	

	public static void main(String[] args) {
		Vector<Integer> vc = new Vector<Integer>();
		Iterator it = vc.iterator();
		System.out.print("정수 (-1 이 입력될 때까지) >>");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int num = sc.nextInt();
			
			if(num==-1)
				break;
			
			vc.add(num);
			
		
			
		}
		int maxNum = Collections.max(vc);
		System.out.print(" 가장 큰 수는 "+ maxNum);

		sc.close();
	}
}
