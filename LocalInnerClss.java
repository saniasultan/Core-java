package inheritance;
class outerclss{
	int a,b;
	void display() {
		class LocalClass{
			void print() {
				System.out.println("a="+a+"\tb"+b);
			}
		}
		LocalClass c=new LocalClass();
		c.print();
	}
}
public class LocalInnerClss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerclss o=new outerclss();
		o.display();
	}

}
