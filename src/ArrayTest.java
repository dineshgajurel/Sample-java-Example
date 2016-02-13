//import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("give the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		// System.out.println("the size of the array is " +size);
		System.out.println("give the " + size + " vlaues of the array");
		for (int i = 0; i < a.length; i++) {
			int v = sc.nextInt();
			a[i] = v;

		}

		// int b[]={4,2,8,9};

		System.out.println("the array is ");

		System.out.println("a[]=" + Arrays.toString(a));

		Arrays.sort(a);
		System.out.println("the sorted aray is ");
		System.out.println("a[]=" + Arrays.toString(a));
		// Arrays.fill(a,1,3,5);
		// for (int i = 0; i < a.length; i++) {
		// System.out.println(a[i]);
	}

}
