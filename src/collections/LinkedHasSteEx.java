package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHasSteEx {

	public static void main(String[] args) {
Set<Integer > s=new LinkedHashSet<Integer>();
List<Integer> intlist=Arrays.asList(20,12,12,14,15,16);
s.addAll(intlist);
System.out.println(s);

Set<String > ss=new LinkedHashSet<String>();
List<String> slist=Arrays.asList("yojan","mote","Dinesh");
ss.addAll(slist);
System.out.println(ss);

	}

}
