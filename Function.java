package basicprograms;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
addInt();
SubInt(20,10);
int a=40,b=10;
SubInt(a,b);
int m=maxInt(45,56);
System.out.println("maximum value="+m);
	}
	static void addInt() {
		int a=10,b=10;
		System.out.println("addtion="+(a+b));
	}
	static void SubInt(int a,int b) {
		System.out.println("substraction="+(a-b));
	}
	static int maxInt(int a,int b) {
		if(a>b)
			return a;
		else
			return b;
		
	}
}

