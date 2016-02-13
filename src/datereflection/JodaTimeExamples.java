package datereflection;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class JodaTimeExamples {

	public static void main(String[] args) {
DateTime d=new DateTime();
System.out.println("Date is " +d.toDate());
int month=d.getMonthOfYear();
System.out.println("Month is " +month);
System.out.println("Day of week is:   " +d.dayOfWeek().getAsShortText());
System.out.println("Day of Month: " +d.dayOfMonth().getAsText());
System.out.println("Day of year: " +d.dayOfYear().getAsText());
int max=d.dayOfMonth().getMaximumValue();
System.out.println("Last day of this month " +month +" is " +max+" day");
boolean leapYear=d.yearOfEra().isLeap();
System.out.println(leapYear);
DateTime plus=d.plusDays(30);
System.out.println("The date after 30 days is " +plus);
DateTimeFormatter formatDate=DateTimeFormat.forPattern("dd/MM/yyyy");
System.out.println(d.toString(formatDate) + "+20 day=" +plus.toString(formatDate));
	}

}
