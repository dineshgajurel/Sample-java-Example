package oop.inheritance;

public class Vehicle {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int speed;
	protected int size;

	protected void attribute() {

		System.out.println("the color is " + color);
		System.out.println("the speed is " + speed);
		System.out.println("the size is " + size);
	}

}
