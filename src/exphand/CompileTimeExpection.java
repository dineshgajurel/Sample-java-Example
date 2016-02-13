package exphand;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class CompileTimeExpection {

	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("D:\\temp.txt");
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,
					"this is error " + e.getMessage());

		}

	}
}
