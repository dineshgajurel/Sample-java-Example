package mthread;

public class FacebookLike {
public int like =0;
public FacebookLike(int l){
	like=l;
	
}
public synchronized void plus1(){
	like++;
	System.out.println( Thread.currentThread().getName() +"likes " +like);
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
