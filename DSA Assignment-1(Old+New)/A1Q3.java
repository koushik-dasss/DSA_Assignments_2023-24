/* 
Question-3:

Write a java program to check whether a number is a spy number or not.

Example:
N = 132
Sum of digit of N = 1 + 3 + 2 = 6
Product of digit of N = 1 × 3 × 2 = 6
So, 132 is a spy number.

Sample Run:
Enter a number: 1124
1124 is a spy number.
*/ 

import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int num = n ; // storing the original value for later use 
        int sum = 0 , p = 1 , r ;
        while(n!=0){
            r=n%10;
            sum+=r;
            p*=r;
            n/=10;
        }if (sum==p){
            System.out.println(num+" is a spy number.");
        }
        sc.close();
    }
    
}
