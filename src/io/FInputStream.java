package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FInputStream {
public static void main(String[] args) {
	try {
		FileInputStream fin= new FileInputStream("E:\\a.txt");
	int i=0;
		while((i=fin.read())!=-1){
			
			System.out.print((char) i);
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
}
