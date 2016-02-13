package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
Vector<String > vec=new Vector<String>();
vec.addElement("Apple");
vec.addElement("Orange");
vec.addElement("Mango");
System.out.println("Size is " +vec.size());

Enumeration <String> en=vec.elements();
System.out.println("Elements are ");
while(en.hasMoreElements()){
	System.out.println(en.nextElement()+"  ");
}
	}

}
