package oop.overloading;

public class MethodOverloading {
	void add(float a, float b) {

		System.out.println(a + b);
	}

	void add(double a, double b) {
		System.out.println(a + b);

	}

	public static void main(String[] args) {
		MethodOverloading o = new MethodOverloading();
		o.add(5.6, 5.9);
		o.add(4, 5);

	}
}
