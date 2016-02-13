import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigDecimal b = BigDecimal.valueOf(2356.444);
		BigDecimal a = new BigDecimal("33.333");
		BigDecimal c = b.add(a);
		System.out.println("this is b " + b);
		System.out.println("this is a " + a);
		System.out.println("this is c " + c);
		BigInteger bi = BigInteger.valueOf(4444);
		BigInteger bii = new BigInteger("5555");
		BigInteger biii = bii.add(bi);
		System.out.println(bi);
		System.out.println(bii);
		System.out.println(biii);

	}

}
