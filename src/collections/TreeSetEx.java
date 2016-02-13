package collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
Set<String> treeSet=new TreeSet<String>();
treeSet.addAll(Arrays.asList("String1","String2","String3","String"));
System.out.println(treeSet);
Set<Integer> iSet=new TreeSet<Integer>();
iSet.addAll(Arrays.asList(2,4,4,3));
System.out.println(iSet);
	}

}
