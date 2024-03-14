package ExceptionHandling;

public class CustomExceptionDemo {

	public static void main(String[] args) 
	throws InvalidAge{
		// TODO Auto-generated method stub
int age=9;
try {
	if(age<18)
		throw new InvalidAge("wrong age");
	System.out.println(age);
}
catch(InvalidAge e) {
	
	System.out.println(e.getMessage());
}
	}

}
