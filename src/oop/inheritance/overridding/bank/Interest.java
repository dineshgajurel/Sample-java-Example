package oop.inheritance.overridding.bank;

public class Interest {

	public static void main(String[] args) {
		System.out.println("YOu can choose the bank with maximum profit");
		Mega m = new Mega();
		System.out.println("the rate of mega is " + m.getRate() + "%");
		Janata j = new Janata();
		System.out.println("the rate of janata is " + j.getRate() + "%");
		Sbi s = new Sbi();
		System.out.println("the rate of Sbi is " + s.getRate() + "%");
		Interest i=new Interest();
		i.largeRate(m, j, s);

	}

	public void largeRate(Mega m, Janata j, Sbi s) {

		if (m.getRate() > s.getRate() && m.getRate()>j.getRate()) {

			System.out.println("the mega has large rate ");
		}
		else if( s.getRate()>m.getRate() && s.getRate()>j.getRate()){
			System.out.println("the Sbi has large rate");
		}
		else{
			System.out.println("the janata has large rate ");
		}
	}

}
