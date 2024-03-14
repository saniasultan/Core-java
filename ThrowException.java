package ExceptionHandling;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float per=102;
try {
	if(per>100)
		throw new Exception();
		System.out.println("percentage="+per);
}
catch(Exception e) {
	System.out.println("wrong percentage");
}
finally {
	System.out.println("code in finally block");
}
	}

}
