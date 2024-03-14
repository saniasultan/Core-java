package ExceptionHandling;

public class MultiplCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] no= {23,55,66};
//System.out.println("no[0]"+no[0]+"no[3]"+no[3]);
//try {
//	for(byte i=0;i<=2;i++) 
//		System.out.println("no["+i+"]="+no[i]);
//	int c=no[0]/0;
//}
//catch(ArrayIndexOutOfBoundsException e) {
//	System.out.println(e.getMessage());
//}
//catch(ArithmeticException e) {
//	System.out.println(e.getMessage());
//}
try {
	System.out.println("no[3]"+no[3]);
	try {
		int c=no[0]/0;
	}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		
	}
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e.getMessage());
}
	}

}
