public class ConsMultiply {

	int a;
	int b;

	public ConsMultiply(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public void multiply() {

		int mul = a * b;
		System.out.println("the result is " + mul);
	}

	public static void main(String[] args) {
		ConsMultiply obj = new ConsMultiply(5, 6);
		obj.multiply();

	}

}
