package io;

import java.util.Scanner;

public class ScannerDelimated {

	public static void main(String[] args) {
String s="My name is Dinesh Gajurel";
Scanner sc=new Scanner(s).useDelimiter("\\s");
sc.next();
System.out.println(sc.next().toUpperCase()+":");
sc.next();
System.out.println(sc.next());
	}

}
