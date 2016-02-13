package oop;

public class PrintThisKeyword {
public void printThis(){
	System.out.println(this);
}
	public static void main(String[] args) {
PrintThisKeyword o=new PrintThisKeyword();
o.printThis();
System.out.println(o);
	}

}
