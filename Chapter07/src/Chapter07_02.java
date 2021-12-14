import java.util.*;

public class Chapter07_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> array = new ArrayList<Character>(6);

		System.out.println("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >>");
		String score = sc.nextLine();
		String[] a = score.split(" ");		// 공백빼고 글자만 배열에 삽입
		for (int i = 0; i < a.length; i++) {
			array.add(a[i].charAt(0));
		}
		Iterator<Character> It = array.iterator();
		double num;
		double sum = 0;
		
		
		
		while (It.hasNext()) {
			char grade = It.next();

			switch (grade) {
			case 'A':
				num = 4.0;
				break;
			case 'B':
				num = 3.0;
				break;
			case 'C':
				num = 2.0;
				break;
			case 'D':
				num = 1.0;
				break;
			default:
				num = 0.0;


			}
			sum += num;

		}
		
		
		double result = sum / array.size();
		System.out.println(result);

		sc.close();

	}

}
