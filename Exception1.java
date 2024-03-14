package ExceptionHandling;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20,b=0;
System.out.println("hi");
try {
	int c=a+b;
	int d=a/b;
	System.out.println("C="+c);
	System.out.println("D="+d);
}
catch(Exception e) {
	System.out.println(e.getMessage());
}
System.out.println("end");
	}

}
