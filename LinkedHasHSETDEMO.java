package arrayList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasHSETDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> ccname=new LinkedHashSet<>();
		ccname.add("India");
		ccname.add("usa");
		ccname.add("uk");
		System.out.println(ccname);
		System.out.println(ccname.contains("uk"));
		ccname.remove("India");
		System.out.println(ccname);
	}

}
