package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
List<String > country=new ArrayList<String>();
country.add("Nepal");
country.add("Japan");
country.add("USA");
Iterator<String> it=country.iterator();
while(it.hasNext()){
	String country1=it.next();
	System.out.println(country1);
	
}
	}

}
