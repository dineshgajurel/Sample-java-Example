package mthread;

public class SynLike {

	public static void main(String[] args) {
final FacebookLike f=new FacebookLike(100);
Thread user1=new Thread(){
	public void run(){
		
		f.plus1();
	}
	
};
Thread user4=new Thread(){
	public void run(){
		
		f.plus1();
	}
	
};
Thread user3=new Thread(){
	public void run(){
		
		f.plus1();
	}
	
};
Thread user2=new Thread(){
	public void run(){
		
		f.plus1();
	}
	
};
user1.start();
user2.start();
user3.start();
user4.start();
	}

}
