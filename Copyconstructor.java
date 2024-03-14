package inheritance;
class a {
	int c_id;
	String c_name;
	a(int c_id,String c_name){
		this.c_id=c_id;
		this.c_name=c_name;
	}
	a(a c){
		c_id=c.c_id;
		c_name=c.c_name;
	}
	void display(){
		System.out.println("c_id="+c_id+"\nc_name="+c_name);
	}
}
public class Copyconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
a a1,a2,a3;
a1=new a(1,"India");
a1.display();
a2=new a(a1);
a2.display();
a3=a1;
a3.display();
a1.c_id=90;

System.out.println("after");
a1.display();
a2.display();
a3.display();
	}

}
