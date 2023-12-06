package array.oops;

public class bit2 {
    public static void main(String[] args) {
        int n=107;
        int i=3;
        int mask=1<<i;
        mask=~mask;
        System.out.println(n&mask);

    }
}
