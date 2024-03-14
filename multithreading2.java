package multithreading;
class ThreadClass11 implements Runnable{
	public void run() {
		for(byte i=1;i<=100;i++) {
			System.out.println("thread 1="+i);
		}
	}
}
class ThreadClass22 implements Runnable{
	public void run() {
		for(byte i=1;i<=100;i++) {
			System.out.println("thread 2="+i);
		}
	}
}
public class multithreading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass11 t1=new ThreadClass11();
		Thread t=new Thread(t1);
		ThreadClass22 t2=new ThreadClass22();
		t.start();
	    t=new Thread(t2);
		t.start();
	}

}
