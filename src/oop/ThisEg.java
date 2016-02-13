package oop;

public class ThisEg {
	
	void print(){
		
		System.out.println(this);
	}
public static void main(String[] args) {
	ThisEg o=new ThisEg();
	o.print();
	System.out.println(o);
}
}
