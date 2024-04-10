import java.util.*;
public class A3Q9 {
    public static int fibo(int n ){
        if(n<2){
            return n;
        }else{
            return fibo(n-1)+fibo(n-2);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one number : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number at position "+ n + " is " +  fibo(n));

    }
}
