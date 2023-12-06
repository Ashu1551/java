import java.util.Scanner;

public class p4{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i=1;
        int n = scan.nextInt();
        while(i<=10){
            System.out.println("table is:"+i*n);
            i=i+1;
        }
    }
} 