package inheritance;
class base{
	void dis() {
		System.out.println("base method");
	}
}
class derived extends base{
	void dis() {

		System.out.println("derived method");
		
	}
	void print() {
		super.dis();
	}
}
public class Methodoverirding {
public static void main(String[] args) {
	derived d=new derived();
	d.dis();
	d.print();
}
}
