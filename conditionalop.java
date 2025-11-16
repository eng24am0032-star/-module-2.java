import java.util.Scanner;
public class conditionalop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE MARKS: ");
        int marks = sc.nextInt();
        if(marks>=50){
            System.out.println("PASSED.");
        }
             else {
                System.out.println("FAILED.");
            }

            if(marks>=95){
                System.out.println("GRADE:A+");
            }
            else if(marks>=90){
                System.out.println("GRADE:A");
            }
            else if(marks>=85){
                System.out.println("GRADE:B+");
            }
            else if(marks>=80){
                System.out.println("GRADE:B");
            }
            else if(marks>=75){
                System.out.println("GRADE:C+");
            }
             sc.close();
        }
    }