package oop.inheritance.overridding.bank;

public class Sbi extends Bank {
	@Override
	protected int getRate() {
		return 9;

	}
}
