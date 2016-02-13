package datereflection;

import java.util.Date;

public class SimpleDateFormat {

	public static void main(String[] args) {
Date d=new Date();
java.text.SimpleDateFormat f=new java.text.SimpleDateFormat("MM/dd/yyyy");
String s=f.format(d);
System.out.println(s);
	}

}
