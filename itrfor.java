import java.util.Scanner;

public class itrfor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE NO : ");
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            System.out.println("count : "+i);
        }
        sc.close();
    }
}
