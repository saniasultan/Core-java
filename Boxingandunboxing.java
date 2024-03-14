package inheritance;

public class Boxingandunboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=17;
System.out.println("num1="+num1);
Integer num2=new Integer(num1);
System.out.println("num2="+num2);
Integer num3=num1;
System.out.println("num3="+num3);

Double dnum1=new Double(11.9);
System.out.println("dnum1="+dnum1);
Double dnum2=dnum1.doubleValue();
System.out.println("dnum2="+dnum2);
double dnum3=dnum1;
System.out.println("dnum3="+dnum3);
	}

}
