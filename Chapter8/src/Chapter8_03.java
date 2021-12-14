import java.io.*;

public class Chapter8_03 {

	public static void main(String[] args) {
		FileInputStream fin = null;

		try {
			fin = new FileInputStream("c:\\windows\\system.ini");
			int c;
			while ((c = fin.read()) != -1) {
				c =(char)c;
				c=Character.toUpperCase(c);
				System.out.print(c);
			}
		} catch (IOException e) {
			System.out.println("오류 발생");
		}

	}

}
