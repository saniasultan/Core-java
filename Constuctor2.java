package oops;

public class Constuctor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Square s=new Square(4.3f);
s.area();
	}

}
class Square{
	float side;
	Square(float s){
		side=s;
	}
	void area() {
		System.out.println("arae of circle is="+side*side);
	}
}
