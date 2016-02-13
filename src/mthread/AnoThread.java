package mthread;

public class AnoThread {

	public static void main(String[] args) {

		Thread t=new Thread(){
			
		public void 	run(){
			System.out.println("this is t " +Thread.currentThread().getName());
			
		}
		};
		t.start();
		
		Runnable r=new Runnable(){
			public void run(){
				
				System.out.println("this is runnable" +Thread.currentThread().getName());
			}
			
			
		};
		Thread t1=new Thread(r);
		t1.start();
		
	}

}
