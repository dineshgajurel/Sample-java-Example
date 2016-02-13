package oop.inheritance.overridding.bank;

public class Mega extends Bank {
	@Override
	protected int getRate() {
		return 7;
	}
}
