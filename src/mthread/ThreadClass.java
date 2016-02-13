package mthread;

public class ThreadClass  extends Thread{

	@Override
	public void run(){
		System.out.println("running thread class thread  " +Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		//create a thread
	ThreadClass th=new ThreadClass();
	th.setName("my thread");
	th.start();
	
	ThreadClass t=new ThreadClass();
	t.start();
	//main thread 
	System.out.println("running inside the main method" +Thread.currentThread().getName());
	}

}
