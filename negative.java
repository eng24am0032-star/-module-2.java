public class negative {
    public static void main(String[] args) {
        int num = 7;
        String result = (num>0)? "positive":(num<0)? "negative":"zero";
        System.out.println("The number "+num+" is "+result);
    }
}