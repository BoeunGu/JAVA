import java.util.*;

public class Chapter07_04 {

	public static void main(String[] args) {
		int sum = 0;
		int n = 0;
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("강수량 입력 (0입력시 종료) >>  ");
			int input = sc.nextInt();
			v.add(input);

			for (int j = 0; j < v.size(); j++) {
				n = v.get(j);
				System.out.print(n+" ");
				sum+=n;
			}
			System.out.println(" ");
				
				System.out.println("현재 평균 " + sum / v.size());
				sum=0;


			if (input == 0) {
				break;
				
			}

		}
		sc.close();

	}
}