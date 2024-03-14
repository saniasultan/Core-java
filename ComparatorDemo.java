package arrayList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(99);
		pq.offer(55);
		pq.offer(-3);
		System.out.println(pq);
		pq.offer(-1);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
	}

}
