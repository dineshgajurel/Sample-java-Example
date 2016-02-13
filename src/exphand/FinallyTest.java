package exphand;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
FinallyTest obj=new FinallyTest();
obj.finallyTest();
	}
public 	void finallyTest(){
	
	Scanner sc=null;
	try{
		
		sc=new Scanner(System.in);
		System.out.println("input integer");
		int v=sc.nextInt();
		System.out.println(v);
		
		
	}catch(Exception e){
		e.printStackTrace();
		
	}finally{
		sc.close();
		System.out.println("this is executed");
		
	}
	
	
}

}
