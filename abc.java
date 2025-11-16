import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s1 =sc.nextLine();
        System.out.println("The length of the string = "+s1.length());
        System.out.println("the first letter of the string is : "+s1.charAt(0));
        System.out.println("the last letter of the string is : "+s1.charAt(s1.length()-1));
        for(int i = 0;i<s1.length()-1;i++)
        System.out.println("The original string is : "+s1.charAt(i));
        for(int i=s1.length()-1;i<=0;i++)
        System.out.println("The reversed string is : "+s1.charAt(i));
        sc.close();
    }
}
