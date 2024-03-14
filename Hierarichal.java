package inheritance;
class Circle{
	float radius;
	final float pi=3.14f;
	void getradius(float r) {
		radius= r;
	}
	
}
class areaofcircle extends Circle{
	float area;
	float circlearea() {
		area=pi*radius*radius;
		return(area);
	}
}
class circumference extends Circle{
	float circum;
	float circumcircle() {
		circum=2*pi*radius;
		return(circum);
	}
}

public class Hierarichal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaofcircle a=new areaofcircle();
		a.getradius(4);
		System.out.println("area of circle ="+a.circlearea());
		circumference c=new circumference();
		c.getradius(4);
		System.out.println("circumference of circle="+c.circumcircle());
		//System.out.println();
	}

}
