package exphand;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int i=sc.nextInt();
		try{
		approAge(i);
		}catch(ArithmeticException e){
			
			e.printStackTrace();
		}
		System.out.println("this is after the exception");
	}

	public static void approAge(int age) {
		if (age < 16) {
			throw new ArithmeticException("Age:" + age + "is not appropriate");

		} else {

			System.out.println("your age is appropriate");
		}

	}

}
