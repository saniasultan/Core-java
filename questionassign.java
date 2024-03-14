package inheritance;
abstract class transportation{
	String source;
	String Destinantion;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestinantion() {
		return Destinantion;
	}
	public void setDestinantion(String destinantion) {
		Destinantion = destinantion;
	}
	abstract void transport();
	
}
class Bus extends transportation{

	@Override
	void transport() {
		// TODO Auto-generated method stub
		System.out.println("bus  "+source+"  "+Destinantion);
	}
	
}
class Flight extends transportation{

	@Override
	void transport() {
		// TODO Auto-generated method stub
		System.out.println("flight "+source+"  "+Destinantion);
	}
	
}
public class questionassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		transportation t=new Bus();
//		t.Destinantion="abc";
//		t.source="pqr";
		t.setDestinantion("dubai");
		t.setSource("india");
//		System.out.println(t.getDestinantion());
//		System.out.println(t.getSource());
		t.transport();
	 t=new Flight();
	 t.Destinantion="abc";
		t.source="pqr";
		t.transport();
	}

}
