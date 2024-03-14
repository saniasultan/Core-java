package lamdaexpression;
interface interfaces{
	void show();
}
public class LamdaExpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
interfaces i1=()->{
	System.out.println("show get called");
//	System.out.println(" get called");
};
i1.show();
	}

}
