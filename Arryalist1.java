package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Arryalist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> name=new ArrayList<>();
name.add("Sania");
name.add("Priti");
name.add("hanii");
System.out.println(name);
name.remove(1);
System.out.println(name);
name.set(0,"SANIA");
System.out.println(name);
System.out.println(name.get(0));
//for  loop
System.out.println("with for loop");
for(byte i=0;i<=name.size()-1;i++) {
	System.out.println(name.get(i));
}
//for each loop
System.out.println("with for each loop");
for(String s:name)
	System.out.println(s);

//iterator
System.out.println("iterator");
Iterator it=name.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
name.clear();
System.out.println(name);

	}

}
