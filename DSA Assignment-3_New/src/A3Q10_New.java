/*The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers,
each is the sum of the preceding two. Write a recursive method in Java which, given n,
returns the n
th Fibonacci number.     */
import java.util.*;
public class A3Q10_New {
    public static int Fibo(int n ){
        if(n<=2){
            return  1 ;
        }else{
            return Fibo(n-1)+Fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The "+ n +"th Fibonacci Number is : " + Fibo(n));
    }
}
