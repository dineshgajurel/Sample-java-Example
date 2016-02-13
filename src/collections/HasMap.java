package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HasMap {

	public static void main(String[] args) {
Map<Integer,String> hashMap=new HashMap<Integer,String>();
hashMap.put(1, "Dinesh");
hashMap.put(3, "Yojan");
hashMap.put(2, "Mote");
hashMap.put(2, "L Dinesh");
String v= hashMap.get(2);
System.out.println("value of key 2 is \"" + v+"\"" );
hashMap.remove(3);
String v1= hashMap.get(3);
System.out.println(v1);
String v2= hashMap.get(5);
System.out.println(v2);

Set<Entry<Integer,String> >set=hashMap.entrySet();
Iterator<Entry< Integer,String>> it=set.iterator();

	}

}
