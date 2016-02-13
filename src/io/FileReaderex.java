package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderex {
	public static void main(String[] args) {
		try {
			FileReader f=new FileReader("E:\\b.txt");
			int i;
			try {
				while((i=f.read())!=-1){
					
					System.out.print((char) i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}