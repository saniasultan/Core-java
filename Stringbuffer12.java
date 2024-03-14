package oops;

public class Stringbuffer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer("Abc");
//System.out.println("capacity="+sb.capacity());
//sb.append("abcdfffgrwwbnhbns");
//System.out.println("capacity="+sb.capacity());
////17*2+2
//System.out.println(sb);
//System.out.println("capacity="+sb.reverse());
System.out.println(sb);
sb.insert(3, "def");
System.out.println(sb);
sb.insert(6, 'g');
System.out.println(sb);
sb.deleteCharAt(6);
System.out.println(sb);
sb.replace(2, 5, "sania");
System.out.println(sb);

	}

}
