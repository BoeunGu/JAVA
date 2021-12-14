import java.io.*;
import java.util.*;

public class Chapter8_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:\\temp\\phone.txt");
			System.out.println("전화번호 입력 프로그램입니다.");

			while (true) {
				System.out.print("이름 전화번호 >>");
				String line = sc.nextLine();
				if (line.length() == 0)
					break;

				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		sc.close();
	}

}
