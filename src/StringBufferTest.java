
public class StringBufferTest {

	public static void main(String[] args) {
		//append
		StringBuffer sb= new StringBuffer();
		sb.append("HELLO");
		sb.append("JAVA");
		
		System.out.println(sb);
		System.out.println(sb.toString());
		
		
		//replace
		sb.replace(1, 3,"hi");
		System.out.println(sb);
		
		//delete
		sb.delete(1, 3);
		System.out.println(sb);
		
		
		//sb.delete(0,5);
		//System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
