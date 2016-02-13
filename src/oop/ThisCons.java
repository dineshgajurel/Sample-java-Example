package oop;

public class ThisCons {

	int id;
	String name;

	ThisCons() {
		System.out.println("THis is default constructor");

	}

	ThisCons(int id, String name) {
		this();
		this.id = id;
		this.name = name;

	}

	void display() {

		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		ThisCons o1 = new ThisCons(1, "hari");
		ThisCons o2 = new ThisCons(2, "ram");
		o1.display();
		o2.display();
	}

}
