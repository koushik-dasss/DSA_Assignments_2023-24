/* Write a recursive method in Java to return the greatest common divisor(gcd) of two integers m
and n, given that in general, gcd(m,n)=gcd(n, m mod n).*/
import java.util.*;
public class HA3Q1_New {
    public static int GCD(int a , int b ){
        if(b==0){
            return a ;
        }else{
            return GCD(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The GCD of "+ a + " and "+ b +" is : "+ GCD(a,b));
        sc.close();
    }
}
