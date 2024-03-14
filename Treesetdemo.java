package arrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Treesetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> ccname=new TreeSet<>(Comparator.reverseOrder());
		//Set<String> ccname=new TreeSet<>();
		ccname.add("India");
		ccname.add("usa");
		ccname.add("uk");
		ccname.add("pk");
		System.out.println(ccname);
		System.out.println(ccname.contains("uk"));
		ccname.remove("India");
		System.out.println(ccname);
		ccname.add("India");
		ccname.add("India");
		System.out.println(ccname);
	}

}
