package oop.finalex;

public class FinalVarEx {
	private final double pi = 3.14;
	private final int speed;

	FinalVarEx() {
		speed = 10;
	}


	public void area(final int r) {
		// pi=5;
		// r=7;
		double area = pi * r * r;
		System.out.println(area);

	}

	public static void main(String[] args) {
		FinalVarEx o = new FinalVarEx();
		o.area(5);
	}
}
