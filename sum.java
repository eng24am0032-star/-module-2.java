import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter " +size+ " numbers:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is : ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+"");
        }
            int sum = 0;
    for (int number : arr) {
        sum += number;
    }   
     double average = (double) sum / size;
         System.out.println("Sum of array elements: " + sum);
    System.out.println("Average of array elements: " + average);
        sc.close();
    }
}
    