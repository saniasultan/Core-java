package ExceptionHandling;

public class Finallyexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no;
try {
	no=Integer.parseInt("A");
	
}
catch(NumberFormatException e) {
	System.out.println(e.getMessage());
}
finally {
	System.out.println("code in finally block");
}
	}

}
