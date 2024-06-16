/*Write a recursive method in Java to find the binary equivalent of a positive decimal integer. */
import java.util.*;
public class HA3Q3_New {
    public static String BinaryEquivalent(int n ){
        if(n == 0 ){
            return "0" ;
        }
        if (n == 1 ){
            return "1";
        }
        return BinaryEquivalent(n/2)+(n%2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int n = sc.nextInt();
        System.out.println("The binary equivalent of "+ n + " is : "+ BinaryEquivalent(n));
        sc.close();
    }
}
