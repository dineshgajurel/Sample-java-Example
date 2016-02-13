package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterex {
public static void main(String[] args) {
	try {
		FileWriter f=new FileWriter("E:\\db.txt");
		f.write("Dinesh Gajurel from नेपाल ");
		f.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("Information is added to the file b.txt");
}
}
