package io;

import java.io.*;
//import java.util.Scanner;

public class FoutputStream {
public static void main(String[] args) {
	try {
		FileOutputStream fout=new FileOutputStream("E:\\a.txt");
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Write to the file ");
//		String s=sc.next();
//		
		String s="This ifsdk";
		byte b[]=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("done!!");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e){
		e.printStackTrace();
	}
	
}

}
