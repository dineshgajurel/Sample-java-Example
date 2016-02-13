package innerclass;

public class InnAbstclass {

	public static void main(String[] args) {
Person shyamEat=new ShyamEat();
shyamEat.eat();

Person shyamEat1=new Person(){

	@Override
	void eat() {
System.out.println("again shyam is eating");		
	}
	
};
shyamEat1.eat();
Person ramEat=new Person(){

	@Override
	void eat() {
System.out.println("rm is eating");		
	}
	
};
ramEat.eat();

	
	
	



	}
}
