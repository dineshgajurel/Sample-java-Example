package oop.abstracts;

public abstract class Bank {
	public abstract String getBankName();

	protected abstract int getRate();

	public int serviceChargeRate = 4;

	protected double getDollarExchangeRate() {
		return 101.5;
	}

}
