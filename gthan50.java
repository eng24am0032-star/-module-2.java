import java.util.Scanner;
public class gthan50 {
        public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array : ");
    int size = sc.nextInt();
    int[] numbers = new int[size];
    System.out.println("enter "+size+" numbers:");
    for (int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
    }
    int count = 0;
    for(int num:numbers){
        if(num>50){
        count++;
        }
    }
    System.out.println(" the total numbers greater than 50 in the array are  "+count);
    sc.close();
    }
}

