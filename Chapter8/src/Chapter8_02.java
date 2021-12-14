import java.io.*;

public class Chapter8_02 {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\temp\\phone.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 10);
			while ((c = fin.read()) != -1) {
				System.out.print((char) c);
			}

			fin.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
