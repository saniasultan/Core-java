package inheritance;
import basicprograms.Class1;
class class3 extends Class1{
	void dis() {
		d=99;
		b=60;
		System.out.println("d="+d+" b="+b);
	}
}

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b=90;
System.out.println("b="+b);
class3 c=new class3();
c.dis();
	}

}
