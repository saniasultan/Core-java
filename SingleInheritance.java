package inheritance;
class Superclass {
	byte a;

	public byte getA() {
		return a;
	}

	public void setA(byte a) {
		this.a = a;
	}
}
class subclass extends Superclass{
	byte b;

	public byte getB() {
		return b;
	}

	public void setB(byte b) {
		this.b = b;
	}
	 void result() {
		System.out.println("adddition="+(a+b));	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass s=new subclass();
		s.setA((byte) 20);
		s.setB((byte) 30);
		System.out.println(s.getA()+" "+s.getB());
		s.result();
		
	}

}
