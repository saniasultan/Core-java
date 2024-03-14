package arrayList;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> ccname=new HashSet<>();
ccname.add("India");
ccname.add("usa");
System.out.println(ccname);
System.out.println(ccname.contains("uk"));
ccname.remove("India");
System.out.println(ccname);
	}

}
