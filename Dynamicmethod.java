package inheritance;
class Area {
	void result() {
		System.out.println("Area");
	}
	
}
class Circlearea extends Area{
	void result() {
		System.out.println("circle area");
	}
}
class Square extends Area{
	void result() {
		System.out.println("square");
	}
}
public class Dynamicmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Area a1;
a1=new Circlearea();
a1.result();
a1=new Square();
a1.result();

	}

}
