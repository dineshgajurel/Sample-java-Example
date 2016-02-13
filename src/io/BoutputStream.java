package io;

import java.io.*;
//import java.util.Scanner;

public class BoutputStream {
public static void main(String[] args) {
	FileOutputStream fout=null;
	BufferedOutputStream bout=null;
	try {
		 fout=new FileOutputStream("E:\\a.txt");
		 bout=new BufferedOutputStream(fout);
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Write to the file ");
//		String s=sc.next();
//		
		String s="This ifsdk";
		byte b[]=s.getBytes();
		bout.write(b);
		
		System.out.println("done!!");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e){
		e.printStackTrace();
	}finally{
		try {
			bout.close();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

}
