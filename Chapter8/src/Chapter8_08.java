import java.io.*;

public class Chapter8_08 {

	public static void findBiggest(File dir) {
		long temp = 0;
		File pre = null;

		System.out.println("------------" + dir.getPath() + "�� ���긮��Ʈ �Դϴ�.");

		File[] subFiles = dir.listFiles();

		for (int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long size = f.length();
			System.out.println(f.getName() + "�� ũ��� " + size + " �Դϴ�.");

			pre = subFiles[i];

			if (pre.length() > f.length()) {
				continue;
			} else {
				pre = f;

			}

		}
		System.out.println("���� ū ������"+pre.getName()+"��  "+pre.length()+"�Դϴ�.");
	}

	public static void main(String[] args) {

		File f1 = new File("c:\\");
		findBiggest(f1);

	}

}
