package innerclass;

public class AnimalTest {

	public static void main(String[] args) {
Animal dog=new Animal(){

	@Override
	public void run() {
System.out.println("dog is running");		
	}
	
};
dog.run();

Animal cat=new Animal(){

	@Override
	public void run() {
System.out.println("cat is running");		
	}
	
};
cat.run();
	}

}
