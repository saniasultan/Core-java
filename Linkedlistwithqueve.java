package arrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Linkedlistwithqueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<String> name=new LinkedList();
name.offer("a");
name.offer("b");
System.out.println(name);
name.offer("c");
name.offer("d");
System.out.println(name);
System.out.println("peek at="+name.peek());
name.poll();
System.out.println(name);
System.out.println("peek at="+name.peek());
Iterator it=name.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
