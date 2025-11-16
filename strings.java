public class strings {
    public static void main(String [] args){
        String a = "Hello";
        String b = "Hello";
        System.out.println(a);
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.length());
        System.out.println(a.charAt(4));
        if(a.equals(b)){
            System.out.println("the strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
    }
}