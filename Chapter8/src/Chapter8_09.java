import java.io.*;

public class Chapter8_09 {

	public static void main(String[] args) {
		String subsname;
		int index = 0;
		int count = 0;
		File f = new File("c:\\temp");

		File[] sublist = f.listFiles();

		System.out.println(f.getName() + "���͸��� .txt ������ ��� �����մϴ�...");

		for (int i = 0; i < sublist.length; i++) {
			File subf = sublist[i];
			subsname = subf.getName();
			index = subsname.lastIndexOf(".txt");

			if (index != -1) {
				System.out.println(subf.getName() + " ����");
				subf.delete();
				count++;

			}

		}
		System.out.println("�� " + count + "���� .txt ������ �����Ͽ����ϴ�.");

	}

}
