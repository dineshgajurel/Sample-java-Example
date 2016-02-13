package enumtest;

public enum Currency {
	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
	
	private int values;

	private Currency(int v) {
		values = v;

	}

	public int getValue() {

		return values;
	}
}
