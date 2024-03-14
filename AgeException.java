package oops;
import ExceptionHandling.InvalidAge;
class Stud{
	int age;
	Stud(int age){
		this.age=age;
	}
	void checkage() {
		try {
		if(age<18||age>25) {
			throw new InvalidAge("entered wrong age");
			
	}
		System.out.println("age="+age);}
		catch(InvalidAge e) {
			System.out.println(e.getMessage());
			
			}
	}
	
}

public class AgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stud s=new Stud(26);
s.checkage();
	}

}
