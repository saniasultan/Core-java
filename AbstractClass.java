package inheritance;
abstract class Abstractclass1{
	abstract void show();
	abstract void dis();
	void print() {
		System.out.println("print method");
	}
}
class ebstract extends Abstractclass1{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("displayed subclass");
	}

	@Override
	void dis() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractclass1 e =new ebstract();
		e.print();
		e.show();
		e.dis();
	}

}
