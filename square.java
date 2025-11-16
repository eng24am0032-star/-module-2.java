import java.util.*;
class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        int square = num*num;
        System.out.println("the square of the number is : "+square);
        sc.close();
    }
}
