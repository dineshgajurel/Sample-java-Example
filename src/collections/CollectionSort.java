package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		String[] c = { "Heart", "Diamonds", "Clubs", "Spread" };
		List<String> list = Arrays.asList(c);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}

}
