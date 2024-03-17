/* 
Question-7:

Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs.

Sample Run:

Enter number of elements of Array: 5
Enter elements of the array: 12 14 12 14 13
Maximum element of Array is 14 and occurs 2 times.
Minimum element of Array is 12 and occurs 2 times.
First occurrence of maximum element is at position 2.
Last occurrence of minimum element is at position 3.


*/
import java.util.*;
public class A1Q7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements of Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int max =arr[0] ;
        int max_ctr = 0 ;
        int max_index_first = 0 ;
        int max_index_last = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                max_index_first=i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
                max_ctr+=1;
                max_index_last=i;

            }
        }
        int min = arr[0] ;
        int min_ctr = 0 ;
        int min_index_first = 0 ;
        int min_index_last = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
                min_index_first=i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==min){
                min_ctr+=1;
                min_index_last=i;
            }
        }
        System.out.println("Maximum element of Array is " + max + " and occurs " +  max_ctr + " times. " );
        System.out.println("Minimum element of Array is " + min + " and occurs "+ min_ctr + " times. ");
        System.out.println("First occurence of maximum element is at "+(max_index_first+1));
        System.out.println("Last occurence of minimum element is at "+ (min_index_last+1));
        System.out.println("First occurence of minimum element is at "+(min_index_first+1)); // Extra statement 
        System.out.println("Last occurence of minimum element is at "+ (max_index_last+1));  // Extra statement
        

        
        sc.close();
        
    }
    
}
