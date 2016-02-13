package contro;
import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("give the no;");
int n=sc.nextInt();
do{
	System.out.println("This is do loop");
	n--;
	System.out.println("this is the while loop ");
}while(n>0);
	}

}
