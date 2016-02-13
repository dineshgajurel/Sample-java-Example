package oop.abstracts;

public class TestClass {
	public static void main(String[] args) {
		TestClass o = new TestClass();
		Bank n = new Mega();
		o.display(n);
		
//		Bank b1=new Bank(); this is not valid because Bank is abstract class
	}

	// public static void show(String bankname,int rate){
	//
	// System.out.println("Bank name: " +bankname+ "  Rate:  " +rate);
	// }

	public void display(Bank b) {
		System.out.println("Bank name: " + b.getBankName() + "  Rate:  "
				+ b.getRate());
		System.out.println("ServiceCharge rate :" +b.serviceChargeRate);
		System.out.println("Dollar Exchange rate:" +b.getDollarExchangeRate());

	}

}
