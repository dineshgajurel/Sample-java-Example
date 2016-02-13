package oop.inheritance;

public class Car extends Vehicle {
	private int cc;
	private int gear;
public void attributeCar(){
	
//	System.out.println(color);
	System.out.println(super.getColor());
	System.out.println(speed);
	System.out.println(size);
	System.out.println(cc);
	System.out.println(gear);
	super.attribute();
	
}
	public static void main(String[] args) {
Car c=new Car();
//c.color="red";
c.setColor("red");
c.speed=150;
c.size=100;
c.cc=220;
c.gear=5;
c.attributeCar();
	}

}
