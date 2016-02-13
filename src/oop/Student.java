package oop;

public class Student {

	private int id = 10;
	private int roll = 30;
	private String name = "Ashish";

	private Student(int id, int roll, String name) {

		this.id = id;
		this.roll = roll;
		this.name = name;
	}

	public Student(int id, int roll) {

		this.id = id;
		this.roll = roll;
	}

	boolean equals(Student o) {

		if (this.id == o.id && this.roll == o.roll) {

			return true;
		}
		return false;
	}

	boolean equals1(Student o) {

		if (this.id == o.id && this.roll == o.roll && this.name == o.name) {

			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, 30);
		Student s2 = new Student(2, 40, "hari");
		Student s3 = new Student(1, 30, "Ahish");
		System.out.println(s1.equals1(s2));
		System.out.println(s1.equals1(s3));
	}
}
