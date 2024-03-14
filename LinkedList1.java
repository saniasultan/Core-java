package arrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Byte> age =new LinkedList();
age.add((byte)5);
age.add((byte)25);
System.out.println(age);
age.addFirst((byte)23);
age.addLast((byte)3);
System.out.println(age);
age.removeLast();
System.out.println(age);
age.removeFirst();
System.out.println(age);
	Iterator it=age.iterator();
	byte a;
	while(it.hasNext()) {
		a=(byte) it.next();
		System.out.println(a+" after 3 years "+(a+3));
		
	}
	}

}
