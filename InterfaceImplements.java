package inheritance;
interface p{
	void dis();
}
interface q{
	void print();
}
interface r extends p,q{
	
	void show();
	
}
class imple implements r{

	@Override
	public void dis() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceImplements implements p,q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplements s=new InterfaceImplements();
	s.print();
	s.dis();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}

	@Override
	public void dis() {
		// TODO Auto-generated method stub
		System.out.println("dis");
	}



}
