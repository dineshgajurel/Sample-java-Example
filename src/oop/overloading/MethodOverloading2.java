package oop.overloading;

public class MethodOverloading2 {
	void sum(int a, int b) {

		System.out.println(a + b);
	}

	int sum(int a, int b,int c) {

		return (a + b +c);
	}

	public static void main(String[] args) {
		MethodOverloading2 o = new MethodOverloading2();
	int res=	o.sum((int) 10.3f, (int) 11.4f, (int) 13.6f);
	System.out.println("the sum is " +res);
	}

}
