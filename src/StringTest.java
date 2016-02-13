public class StringTest {

	public static void main(String[] args) {

		// test1
		char ca[] = { 'j', 'a', 'v', 'a' };
		String caStr = new String(ca);
		System.out.println(caStr);

		// test2
		String s = "JAVA";
		System.out.println(s);

		// test3
		System.out.println("javas");

		// test4
		System.out.println("Dinesh  Gajurel".length());

		// test5
		String h1 = "hello";
		int l = h1.length();
		System.out.println(l);

		// test6
		System.out.println("HELLO".toLowerCase());
		// test7
		System.out.println("hello".toUpperCase());

		// test8
		System.out.println("HELLO".indexOf('L'));

		/*
		 * //test9 String str=null; System.out.println(str.length());
		 */

		// test10
		String greeting = "HELLO";
		String sgreeting = greeting.substring(0, 3);
		System.out.println(sgreeting);
		System.out.println(sgreeting.length());
		System.out.println(greeting.substring(0, 2));
		System.out.println(greeting.substring(0));

		// test11
		String string = "hello";
		string.concat("mr");
		System.out.println(string);
		System.out.println(string.concat("mr"));
		System.out.println(string);
		string = string.concat("mr");
		System.out.println(string);

		// test11
		String h = "HELLO";
		String sub = h.substring(0, 3);
		System.out.println(sub == "HEL");

		// test12
		System.out.println(sub.equals("HEL"));
		System.out.println(sub.equals("hel"));
		System.out.println(sub.equalsIgnoreCase("hel"));

		// test 13
		System.out.println("hello" == "hello");

		// test 14
		String hel = "hello";
		System.out.println(hel == "hello");

		// test 15
		String strSplit = "java string split method";
		String[] words = strSplit.split("\\s");
		String[] words1 = strSplit.split("a");
		System.out.println(words1[0]);

		System.out.println(words[0]);// one metohod
		for (int i = 0; i < words.length; i++) { // another method by using loop
			System.out.println(words[i]);

		}
		
		String strings="hello";
		System.out.println(strings);
		System.out.println(strings.toString());

		
	}

}
