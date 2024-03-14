package inheritance;
class outerclass{
	 int a;
	static void disc() {
		System.out.println("dis from outer class");
	}
	static class Nsinnerclass{
		int b;
		
		void print() {
			disc();
			System.out.println(" b="+b);
			
		}
	}
	
}
public class StacticInnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerclass.Nsinnerclass n=new outerclass.Nsinnerclass();
		n.print();
	}

}
