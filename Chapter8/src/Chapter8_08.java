import java.io.*;

public class Chapter8_08 {

	public static void findBiggest(File dir) {
		long temp = 0;
		File pre = null;

		System.out.println("------------" + dir.getPath() + "의 서브리스트 입니다.");

		File[] subFiles = dir.listFiles();

		for (int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long size = f.length();
			System.out.println(f.getName() + "의 크기는 " + size + " 입니다.");

			pre = subFiles[i];

			if (pre.length() > f.length()) {
				continue;
			} else {
				pre = f;

			}

		}
		System.out.println("가장 큰 파일은"+pre.getName()+"의  "+pre.length()+"입니다.");
	}

	public static void main(String[] args) {

		File f1 = new File("c:\\");
		findBiggest(f1);

	}

}
