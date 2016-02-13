package exphand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class MultiCatchExpection {

	public static void main(String[] args) {
		try {
			int value = 45 / 0;
			FileInputStream f = new FileInputStream("c:\\temp.txts");

		} catch (ArithmeticException e) {
			e.printStackTrace();

		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
