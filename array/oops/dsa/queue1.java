package array.oops.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
		q.add(10);
		q.add(20);
		q.offer(30);
		q.add(40);
		q.offer(50);
		
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
    }
    
}
