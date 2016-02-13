package reflection;

public class ReflectionClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
Class c=Class.forName("java.util.Date");
System.out.println(c.getName());
	}

}
