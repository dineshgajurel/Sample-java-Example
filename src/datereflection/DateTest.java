package datereflection;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
Date date1=new Date();
System.out.println(date1);

long millis=System.currentTimeMillis();
Date date2=new Date(millis);
System.out.println(date2);

Calendar cal=Calendar.getInstance();
Date date3=cal.getTime();
System.out.println(date3);

	}

}
