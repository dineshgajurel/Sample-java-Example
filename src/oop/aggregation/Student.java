package oop.aggregation;

public class Student {
	
	int id;
	String name;
	Address address;
	
	public Student(int id, String name,Address address){
		
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display(){
		System.out.println("id :" +id);
		System.out.println("name :" +name);
		System.out.println("city:" +address.city);
		System.out.println("state:" +address.state);
		System.out.println("country:" +address.country);
	}
	

	public static void main(String[] args) {

Address address=new Address("Chautara","capital state","Nepal");
Student s=new Student(8,"hari",address);
s.display();
	}

}
