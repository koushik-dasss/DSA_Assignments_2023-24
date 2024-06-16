import java.util.*;
public class HA3Q5_New {
    public static String ReverseString(String s ){
        if(s == null || s.length()<= 1){
            return s ;
        }
        return ReverseString(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.next();
        System.out.println(s+" when reversed will be : "+ ReverseString(s));
    }
}
