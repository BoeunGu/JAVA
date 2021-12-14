import java.io.*;
import java.util.*;

public class Chapter8_04 {

	
	public static void main(String[] args) {
		FileReader finn = null;
		int n = 1;
		try {

			Scanner fsc = new Scanner(new FileReader("c:\\windows\\system.ini"));

			while (fsc.hasNext()) {
				String line = fsc.nextLine();

				System.out.printf("%4d" + ":", n);
				System.out.println(line);
				// System.out.println("");
				n++;
			}
			
			fsc.close();
		}

		catch (IOException e) {
			System.out.println("오류 발생");

		}
	}
}