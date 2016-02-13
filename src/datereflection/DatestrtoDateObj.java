package datereflection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatestrtoDateObj {

	public static void main(String[] args) throws ParseException {
String sDate="31/03/2015";
SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
Date date=d.parse(sDate);
System.out.println(date);
	}

}
