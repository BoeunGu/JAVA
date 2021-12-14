import java.io.*;

public class Chapter8_09 {

	public static void main(String[] args) {
		String subsname;
		int index = 0;
		int count = 0;
		File f = new File("c:\\temp");

		File[] sublist = f.listFiles();

		System.out.println(f.getName() + "디렉터리의 .txt 파일을 모두 삭제합니다...");

		for (int i = 0; i < sublist.length; i++) {
			File subf = sublist[i];
			subsname = subf.getName();
			index = subsname.lastIndexOf(".txt");

			if (index != -1) {
				System.out.println(subf.getName() + " 삭제");
				subf.delete();
				count++;

			}

		}
		System.out.println("총 " + count + "개의 .txt 파일을 삭제하였습니다.");

	}

}
