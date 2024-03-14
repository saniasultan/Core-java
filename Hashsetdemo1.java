package arrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashsetdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashMap<Integer,String> studname=new HashMap<>();
		//LinkedHashMap<Integer,String> studname=new LinkedHashMap<>();
		TreeMap<Integer,String> studname=new TreeMap<>();
studname.put(1, "Abc");
studname.put(3, "def");
studname.put(2, "ghi");
System.out.println(studname);
studname.put(4, "jkl");
System.out.println(studname);
if(!(studname.containsKey(2))) {
	studname.put(2, "mno");
}
System.out.println(studname);
System.out.println("look for value="+studname.containsValue("jkl"));
studname.putIfAbsent(0, "pqr");
studname.putIfAbsent(-6, "pqr");
System.out.println(studname);
//retrives value for map
System.out.println("all values in map");
for(String val:studname.values()) {
	System.out.println(val);
}
//retrives key from map
System.out.println("all key in map");
for(Integer key:studname.keySet()) {
	System.out.println(key);
}
//retrives key with its value
System.out.println("data in map");
for(Map.Entry<Integer, String> e:studname.entrySet()) {
	System.out.println(e.getKey()+"  "+e.getValue());
	
}
	}

}
