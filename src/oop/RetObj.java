package oop;

class Test {

	int b;

	Test(int i) {
		b = i;

	}

	Test incTen() {

		Test tempr = new Test(b + 10);
		return tempr;

	}
}

public class RetObj {

	public static void main(String[] args) {
		Test o1 = new Test(5);
		Test o2;
		o2 = o1.incTen();
		System.out.println(o1.b);
		System.out.println(o2.b);
		o2 = o2.incTen();
		System.out.println(o2.b);

	}

}
