/*Write a recursive method in Java which, given real value x and a positive integer n, returns
the value of x^n. */
import java.util.*;
public class A3Q8_New {
    public static int Power(int x , int n ){
        if(n==0){
            return 1 ;
        }else{
            return x*Power(x, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X : ");
        int x = sc.nextInt();
        System.out.println("Enter the value of N : ");
        int n = sc.nextInt();
        System.out.println(x+" to the power of " + n + " is : "+ Power(x,n));
        sc.close();
    }
}
