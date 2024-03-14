package Assignment;

public class MethodoverL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Arearc a1=new Arearc();
a1.area(20);
a1.area(2, 4);
	}

}
class Arearc{
	void area(int w,int h) {
		System.out.println("Area of rectangle="+w*h);
	}
	void area(int r)
	{
		System.out.println("area of circle="+3.14*r*r);
	}
}
