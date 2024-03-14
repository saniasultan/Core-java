package multithreading;
class ThreadClass12 implements Runnable{
	public void run() {
		for(byte i=1;i<=100;i++) {
			if(i==10) {
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("thread 1="+i);
		}
		
	}
}
class ThreadClass21 extends Thread{
	public void run() {
		for(byte i=1;i<=100;i++) {
			System.out.println("thread 2="+i);
		}
	}
}
public class Multithreading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass12 t1=new ThreadClass12();
		Thread t=new Thread(t1);
		ThreadClass21 t2=new ThreadClass21();
		t.start();
	t2.start();
	
	}

}
