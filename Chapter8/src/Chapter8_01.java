import java.io.*;
import java.util.*;

public class Chapter8_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:\\temp\\phone.txt");
			System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");

			while (true) {
				System.out.print("�̸� ��ȭ��ȣ >>");
				String line = sc.nextLine();
				if (line.length() == 0)
					break;

				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		sc.close();
	}

}
