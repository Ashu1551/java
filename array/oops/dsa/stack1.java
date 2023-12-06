package array.oops.dsa;
import java.util.*;
public class stack1 {


	public static void main(String[] args) {
		Stack<String> st=new Stack<>();
		st.push("B1");
		st.push("B2");
		st.push("B3");
		st.push("B4");
		System.out.println(st);//print stack
		System.out.println(st.peek());//find last element
		System.out.println(st);
		System.out.println(st.pop());//remove last element
		System.out.println(st);
		System.out.println(st.size());//print stack size
		
		
	}
}

