package oop.overloading;

public class MethodOverloading1 {

	int sum(int a, int b) {

		return (a + b);
	}

	int sum(float a, float b) {
		return (int) (a + b);
	}

	public static void main(String[] args) {
		MethodOverloading1 o = new MethodOverloading1();
		o.sum(4, 7);
		System.out.println();
	}

}
