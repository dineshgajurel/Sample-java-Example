package oop.abstracts;

public class Sbi extends Bank {

	@Override
	public String getBankName() {
		return "Sbi";
	}

	@Override
	protected int getRate() {
		return 5;
	}

}
