package mthread;

public class RunableInterface implements Runnable {

	@Override
	public void run() {
System.out.println("thread:Runnable > run()");
	}

	public static void main(String[] args) {
		RunableInterface runnable=new RunableInterface();
		Thread t=new Thread(runnable);
		t.start();
		System.out.println("Thread:RunnableInterface>main()");
		

	}

}
