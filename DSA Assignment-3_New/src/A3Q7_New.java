// Write a recursive method in Java that computes the factorial of a given integer.
import java.util.*;
public class A3Q7_New {
    public static int Factorial(int n ){
        if(n<2){
            return n ;
        }else{
            return n*Factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The factorial of the number is : "+ Factorial(n));
        sc.close();
    }
}
