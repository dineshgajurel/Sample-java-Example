package oop;

public class StaticBlock {
	int id = 10;
	static String name = "manjane";
	static {
		// id=20;
		name = "harpic";
		System.out.println("this is block " + name);
	}

	public static void main(String[] args) {
		System.out.println("this is main ");
	}

}
