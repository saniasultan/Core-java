package oops;

class Patient{
	int patient_id;
	String name;
	static int count;
	long phno;
	Patient(int patient_id,String name,long phno){
		count++;
		this.patient_id=patient_id;
		this.name=name;
		this.phno=phno;
	}
	void display() {
		System.out.println(count+" patient id="+patient_id+"  name="+name+"  phno"+phno);
	}
	
}
public class Staticvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Patient p1,p2,p3;
p1=new Patient(1234,"Abc",7890273);
p1.display();
p2=new Patient(12456,"def",7894563);
p2.display();
p3=new Patient(1256,"ghi",7890900);
p3.display();

	}

}
