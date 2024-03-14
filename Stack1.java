package arrayList;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String> cityName=new Stack<>();
Scanner s=new Scanner(System.in);
byte n=s.nextByte();
for(byte i=1;i<=n;i++) {
	System.out.println("enter city name");
	String name=s.next();
	cityName.push(name);
}
System.out.println(cityName);
System.out.println("peekat="+cityName.peek());
cityName.pop();
//Iterator
System.out.println("list of cities");
Iterator it=cityName.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
System.out.println("peekat="+cityName.peek());
	}

}
