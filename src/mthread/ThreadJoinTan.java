package mthread;

public class ThreadJoinTan {
	
	private double sin45;
	private double cos45;
	
public static void main(String[] args) {
	final ThreadJoinTan o=new ThreadJoinTan();
	Runnable sin45r=new Runnable(){
		public void run(){
			
			o.sin45=Math.sin(Math.PI/4);
		}
		
	};
	Thread sin45t=new Thread(sin45r);
	
	Runnable cos45r=new Runnable(){
		public void run(){
			
			o.cos45=Math.cos(Math.PI/4);
		}
		
	};
	Thread cos45t=new Thread(cos45r);
	sin45t.start();
	cos45t.start();
	try {
		sin45t.join();
		cos45t.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	double tan45=Math.round(o.sin45/o.cos45);
	System.out.println("The value of tan45 is " +tan45);
	
	
}
}
