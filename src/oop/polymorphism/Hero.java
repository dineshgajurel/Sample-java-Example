package oop.polymorphism;

public class Hero extends Bike {
	@Override
	public void color() {
		System.out.println("the color is best of hero");
	}

	public static void main(String[] args) {

		// compile time polymorphism
		Hero he = new Hero();
		he.color();
		Honda ho = new Honda();
		ho.color();
		Bike b = new Bike();
		b.color();

		// run time polymorphism
		Bike b1 = new Hero();
		b1.color();
		b1 = new Honda();
		b1.color();

		// upcasting
		Bike b2=new Honda();
		Honda h=(Honda)b2;
		//Hero h1=(Hero)b2;
		b2.color();
		h.color();
		

	}

}
