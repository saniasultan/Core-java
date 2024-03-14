package inheritance;
class A1{
	A1(int a){
		System.out.println("a constructor"+a);
	}
}
class B extends A1{
	
	public B() {
		super(20);
		System.out.println("b constructor");
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		
	}

}
