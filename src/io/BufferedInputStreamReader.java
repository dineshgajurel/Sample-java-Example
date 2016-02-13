package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedInputStreamReader {

	public static void main(String[] args) {
try {
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
	System.out.println("Write something..");
	String s=b.readLine();
	System.out.println("u typed ::" +s);
} catch (IOException e) {
	e.printStackTrace();
}
Scanner sc =new Scanner (System.in);
System.out.println("Give something:::");
String s=sc.nextLine();
System.out.println(s);

	}

}
