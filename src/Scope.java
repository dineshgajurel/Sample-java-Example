
public class Scope {
	public static void main(String[] args) {
		int x=10;
		if(x==10){
			int y =20;
			System.out.println("x and y are " +x + "   and   " +y );
			x=y+2;
			
		}
		System.out.println("new x is " +x);
		
	}

}
