


import java.util.Scanner;


public class SwitchDay {

	public static void main(String[] args) {
		System.out.println("give the day ");
		Scanner sc=new Scanner(System.in);
		 
Day d=Day.FRIDAY;
switch (d) {
case SUNDAY:
	System.out.println("this is sunday ");
	break;
case MONDAY:
	System.out.println("this is monday");
	break;
case TUESDAY:
	System.out.println("this is tuesdau");
	break;
case WEDNESDAY:
	System.out.println("this is wednesday");
	break;
case THURSDAY:
	System.out.println("this is thursday");
	break;
case FRIDAY:
	System.out.println("this is friday");
	break;
case SATURDAY:
	System.out.println("this is saturday ");
default:
	System.out.println("r u mad ??");
	break;
}
	}

}
