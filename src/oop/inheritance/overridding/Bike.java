package oop.inheritance.overridding;

public class Bike extends Vehicle {
	@Override
	public void run(){
		
		System.out.println("the bike is running");
	}

	public static void main(String[] args) {
Bike b=new Bike();
b.run();
	}

}
