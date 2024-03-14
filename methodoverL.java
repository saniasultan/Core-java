package Assignment;

public class methodoverL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Volume a1=new Volume();
a1.vol(2, 4);
a1.vol(3);
	}
}

class Volume{
	void vol(int r,int h) {
		System.out.println("volume of cylinder="+3.14*r*r*h);
		
	}
	void vol(int s) {
		
		System.out.println("volume of cylinder="+s*s*s);
	}
	
	
}
