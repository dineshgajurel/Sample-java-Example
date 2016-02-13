
public class Student1 {
	int roll;
	String name;
	String city;
	
	Student1(int roll, String name, String city){
	this.roll=roll;
	this.name=name;
	this.city=city;
	
		
	}

	public static void main(String[] args) {
		Student1 s1=new Student1(10,"dinesh","ktm");
		Student1 s2=new Student1(10,"dinesh","ktm");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.toString());
		System.out.println(s1.toStrings());
		System.out.println(s1.hashCode());
		
		
	}
	
	public String toString(){
		return String.valueOf(roll);
	}
	public String toStrings(){
		return name;
		
	}

}
