public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.sin(Math.PI / 6));
		double f=10.9;
		System.out.println("ctual float value is " + f);
				int i=(int)f;
				System.out.println("simple integer value is " +i);
				int i2=(int)Math.round(f);
				System.out.println("the round offed vlue is " +i2);
				System.out.println("two integers are" + (float)i + "and " + (float)i2);
				byte b=50;
				System.out.println("byte value b is " + b);
				 int c=b *2;
				 System.out.println("automatic promoted value of b is " + c);
				 b=(byte)(b*2);
				 System.out.println( "type casted value of b is " +b);
				 
								

	}

}
