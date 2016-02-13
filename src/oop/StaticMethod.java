package oop;

public class StaticMethod {

	int id;
	String name;
	static String address = "Koteshwor";

	static void changeadd() {
		address = "tinkue";
	}

	StaticMethod(int id, String name) {

		this.id = id;
		this.name = name;

	}

	void show() {

		System.out.println(id + " " + name + " " + address);
	}

	public static void main(String[] args) {
		StaticMethod o1 = new StaticMethod(2, "Ram");
		o1.show();
		changeadd();
		StaticMethod o2 = new StaticMethod(3, "Shyam");

		StaticMethod o3 = new StaticMethod(4, "Hari");
		o1.show();
		o2.show();
		o3.show();
	}

}
