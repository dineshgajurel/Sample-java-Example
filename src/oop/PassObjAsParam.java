package oop;

public class PassObjAsParam {

	public static void main(String[] args) {
Student s1=new Student(1,30);
Student s2=new Student(2,40);
Student s3=new Student(1,30);
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
	}

}
