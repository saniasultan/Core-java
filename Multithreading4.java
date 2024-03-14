package multithreading;
class ThreadClass01 extends Thread{
	public void run() {
		for(byte i=1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
class ThreadClass02  extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" priority is "+Thread.currentThread().getPriority());
		for(byte i=1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
public class Multithreading4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadClass01 t1=new ThreadClass01();
		
		ThreadClass02 t2=new ThreadClass02();
	t1.setName("first thread=");
	t2.setName("seconds thread=");
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MIN_PRIORITY);
	System.out.println(t1.getName()+" priority is "+t1.getPriority());
	 t1.start();
	 t2.start();
	 System.out.println(t1.getName());
	 System.out.println(t2.getName());
	}

}
