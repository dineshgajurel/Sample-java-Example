package oop.abstracts;

public class Janata extends Bank {
	@Override
	public String getBankName() {

		return "Janata";
	}

	@Override
	protected int getRate() {

		return 7;
	}

}
