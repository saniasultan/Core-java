package arrayList;

import java.util.ArrayDeque;

public class Queve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<Integer> aq=new ArrayDeque<>();
aq.offer(34);
aq.offer(77);
System.out.println(aq);
aq.addFirst(5);
aq.offerLast(70);
System.out.println(aq);
aq.poll();
aq.pollLast();
System.out.println(aq);
System.out.println("peekat="+aq.peek());
System.out.println(aq);
	}

}
