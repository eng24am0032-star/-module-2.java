public class operations {
    public static void main(String[] args) {
        int a =4,b=2,c=7;
        int result1 = 10+5*2;
        int result2 = ++a*b+2;
        int result3 = --a*b+2;
        int result4 = (~a+1)*2;
        int result5 = ++a*(b--+~c)-(-b);
        System.out.println("Result1 : "+result1);
        System.out.println("Result2 : "+result2);
        System.out.println("Result3 : "+result3);
        System.out.println("Result4 : "+result4);
        System.out.println("Result5 : "+result5);
    }
}
