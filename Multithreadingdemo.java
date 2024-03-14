package multithreading;
class ThreadClass1 extends Thread{
	public void run() {
		for(byte i=1;i<=100;i++) {
			System.out.println("thread 1="+i);
		}
	}
}
class ThreadClass2 extends Thread{
	public void run() {
		for(byte i=1;i<=100;i++) {
			System.out.println("thread 2="+i);
		}
	}
}

 
public class Multithreadingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass1 t1=new ThreadClass1();
		
		ThreadClass2 t2=new ThreadClass2();
	
	 t1.start();
	 t2.start();
	}

}
