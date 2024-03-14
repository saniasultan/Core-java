package oops;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition a1=new Addition();
a1.add(21, 31);
a1.add(31.2f, 89.6f, 41.5f);
a1.add(5,9);
a1.add(2, 4, 6);
	}

}
class Addition{
	void add(int a,int b) {
		System.out.println("addition="+(a+b));
	}
void add(int a,float b) {
	System.out.println("addition="+(a+b));
	}
void add(int a,int b,int c) {
	System.out.println("addition="+(a+b+c));
}
void add(float a,float b,float c) {
	System.out.println("addition="+(a+b+c));
}
}