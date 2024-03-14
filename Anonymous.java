package ExceptionHandling;
abstract class mainclass{
	abstract void show();
	abstract void print();
}
interface Add{
	
	void addint(int a,int b);
}
public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainclass m=new mainclass() {
			void show() {
				System.out.println("show method gets called");
			}

			@Override
			void print() {
				// TODO Auto-generated method stub
				System.out.println("print method gets called");
			
			}
			
		};
		m.show();
		m.print();
		Add a1=new Add() {

			@Override
			public void addint(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("addition="+(a+b));
			}
			
		};
		a1.addint(20, 30);
	}

}
