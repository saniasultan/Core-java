package inheritance;
class outer{
	static int a;
	void disc() {
		System.out.println("dis from outer class");
	}
	class Nsinner{
		int b;
		
		void print() {
			disc();
			System.out.println("a= "+a+" b="+b);
			
		}
	}
	
}

public class NonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer o=new outer();
		outer.Nsinner i=o.new Nsinner();
		i.print();
		
	}

}
