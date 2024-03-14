package oops;

public class Constructor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CusInfo c=new CusInfo(1234,"sania",7283467,960724442) ;
	
c.display();
CusInfo c1=new CusInfo();
c1.name="sania";
c1.display();
}
}
class CusInfo{
	private int cust_id;
	String name;
	long Accno;
	long phonno;
	CusInfo(){
		System.out.println("new customer is added");
		
	}
	CusInfo(int id,String nm,long no,long pno)
{
		cust_id=id;
		name=nm;
		Accno=no;
		phonno=pno;
		System.out.println("new customer is added");
		}
	void display() {
		System.out.println(cust_id+" "+name+" "+Accno+" "+phonno);
	
	}
}
