public class Constructer {
	int i;
	int length;
	int breadth;
	

	public Constructer(int j) {
this.i=j;
	}
	public Constructer(int length, int breadth){
		
		this.length=length;
		this.breadth=breadth;
	}

	public void ConsMethod() {
		System.out.println("the integer value is " + i);

	}
	public void Area( int length, int breadth){
		int area=length*breadth;
		System.out.println( "Area is " + area);
		
	}

	public static void main(String[] args) {
		Constructer obj = new Constructer(2);

		obj.ConsMethod();
		obj.Area(5,5);
	}

}
