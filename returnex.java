public class returnex {
    public static void main(String[] args) {
        System.out.println("START OF PROGRAM");
        checkNumber(5);
        System.out.println("END OF PROGRAM");
    }
    public static void checkNumber(int num) {
        if(num<0){
            System.out.println("NEGATIVE NUMBER");
            return;
        }
        System.out.println("POSITIVE NUMBER OR ZERO");
    }
}
