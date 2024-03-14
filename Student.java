package ExceptionHandling;
class Student1{
	int marks;
	Student1(int marks){
		this.marks=marks;
	}
	void display() {
		try {
			if(marks>100) {
				throw new Marksoutofbound("entered wrong marks");
				
		}
			System.out.println("marks="+marks);}
			catch(Marksoutofbound e) {
				System.out.println(e.getMessage());
				
				}
		}
		
	}

	
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student1 s=new Student1(101);
s.display();
	}

}
