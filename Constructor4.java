package oops;
class Max{
	int no1,no2;
	void set(int no1,int no2){
		this.no1=no1;
		this.no2=no2;
	}
	int result(){
		if(no1>no2) 
			return no1;
		else 
			return no2;
		
	}
}
public class Constructor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Max m=new Max();
m.set(29, 40);
System.out.println("maximum value="+m.result());
Max m1=new Max();
m1.set(39, 60);
System.out.println("maximum value="+m1.result());
	}
}
