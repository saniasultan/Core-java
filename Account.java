package ExceptionHandling;
class Accountdetails{
	int acc_no;
	String name;
	long balance;
	Accountdetails(long balance){
//	this.acc_no=no;
	this.balance=balance;
//	this.name=name;
	}
	void display(){
		try {
		if(balance<1000||balance>5000) {
			throw new Balancerange("balance should be between 1000 and 50000");
		}
		System.out.println("abalnce="+balance);
		}
		catch(Balancerange b) {
			System.out.println(b.getMessage());
		}
	}
}
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Accountdetails a=new Accountdetails(5000);
a.display();
	}

}
