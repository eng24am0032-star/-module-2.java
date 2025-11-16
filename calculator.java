import java.util.*;
class calculator{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        int d = a-b;
        int e = a*b;
        System.out.println("sum is : "+c);
        System.out.println("difference is : "+d);
        System.out.println("product is : "+e);
    
  if (b == 0) {
            System.out.println("Zero division error");
        } 
        else {
            int f = a / b;
            System.out.println("Quotient is: " + f);
        }
        sc.close();
    }        
}