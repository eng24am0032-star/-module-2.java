import java.util.Scanner;
public class str1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s3,s5,s6;int s4;
        System.out.println("enter the two strings : ");
        String s1 =sc.nextLine();
        String s2 =sc.nextLine();
        System.out.println("");
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        s3 = s1.concat(s2);
        s4 = s1.length();
        
        System.out.println("the first string is : "+s1.toUpperCase());
        System.out.println("the second string is : "+s2.toUpperCase());
        sc.close();
    }
}
