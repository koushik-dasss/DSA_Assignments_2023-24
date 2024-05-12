/*
Question-1:

Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.

Sample Run:

The positive integer greater than 2 from command line argument
is 67.
The number of times one must repeatedly divide this number by 2
before getting a value less than 2 is 5.  

 */

 // TAKING INPUT FROM SCANNER CLASS .
 // FOR CLA input , the change is :-   int n = Integer.parseInt(args[0])

 import java.util.*;
 public class A1Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Considering all the inputs are greater than 2 from the user ( ignoring  unnecessary checking  condition)
        System.out.println("Enter a positive number greather than  2 : ");
        int n = sc.nextInt();
        int ctr = 0 ;
        int num = n ; // storing it for using it in the last statement as n is terminating in while loop 
        while(n>2){
            n/=2;
            ctr+=1;
        }
        System.out.println("The number of times one must repeatedly divide this number by   "+ num + "  before getting a value less than 2 is  "+ ctr + ".");

        
        sc.close();
    }
 }

 // Another approach with slight changes leading to same results in a different iterating way :-
 
 /*     System.out.println("Enter a positive number greather than  2 : ");
        int n = sc.nextInt();
        int ctr = 0 ;
        int num = n ; // storing it for using it in the last statement as n is terminating in while loop 

(changes)-> while(n/2>=2){    // ITERATING TILL 4(4/2==2) rather than going directly till 2 . Little less time complexity with the same space complexity.
            
            n/=2;
            ctr+=1;
        }
        System.out.println("The number of times one must repeatedly divide this number by   "+ num + "  before getting a value less than 2 is  "+ ctr + ".");

*/        