/*Write a recursive method in Java to find the product of 2 numbers */
import java.util.*;
public class HA3Q4_New {
    public static int Product(int a , int b ){
        if(a == 0 || b == 0 ){
            return 0 ;
        }
        if(b>0){
            return a + Product(a,b-1);
        }else {
            return -Product(a, -b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The product of "+ a + " and "+ b + " is : "+ Product(a,b));
        sc.close();
    }
}
