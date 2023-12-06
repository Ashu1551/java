package stringb;

public class sb1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
	    
		System.out.println(sb);
		sb.append(" world");
		sb.append("a");
		sb.append("345");
		sb.deleteCharAt(12);
		sb.insert(11,"java");
		System.out.println(sb);
		String s=sb.toString();
		System.out.println(sb.charAt(0));
		System.out.println(sb.length());
		System.out.println(s);
	
	}
}


