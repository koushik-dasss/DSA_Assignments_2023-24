/*Write a recursive method in Java to search an element of an array using binary search. */

// USED BUBBLE SORT for sorting .
import java.util.*;
public class HA3Q2_New_BubbleSort {
    public static int[]  BubbleSort(int[]A){
        for(int i = 0 ; i<A.length ; i++){
            for(int j = 0 ; j<A.length - i - 1 ; j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        return A ;
    }
    public static int Recursive_BinarySearch(int [] A , int L , int H , int item){
        while(L<=H){
            int mid = L +(H-L)/2;
            if(A[mid]==item){
                return mid;
            }else if(A[mid]>item){
                return Recursive_BinarySearch(A,L,mid-1,item);
            }else{
                return Recursive_BinarySearch(A,mid+1,H,item);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int [] A = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            A[i] = sc.nextInt();
        }
        System.out.println("The sorted array is : ");
        int[] sortedArray = BubbleSort(A);
        for(int i = 0 ; i<n ; i++){
            System.out.print(sortedArray[i]+" ");
        }
        System.out.println();
        int L = 0 ;
        int H = n-1;
        System.out.println("Enter the element to be searched : ");
        int item = sc.nextInt();
        if(Recursive_BinarySearch(A,L,H,item)!=-1){
            System.out.println("The element "+ item + " is present at position : "+ Recursive_BinarySearch(A,L,H,item));
        }else{
            System.out.println("The element "+ item + " is not present in the array .");
        }
        sc.close();
    }
}
