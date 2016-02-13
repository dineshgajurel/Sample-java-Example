package oop.overloading;

public class AmbigiousOverloading {
	void sum(int a, long b) {

		System.out.println("1st is invoked ");

	}

	void sum(long a, int b) {
		System.out.println("2nd method is invoked ");

	}

	public static void main(String[] args) {
		AmbigiousOverloading o = new AmbigiousOverloading();
		o.sum(10, 12l);
	}

}
