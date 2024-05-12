/*Write a java program to print an array of different type using a single Generic method. The
signature of printArray method is given below.
public static < E > void printArray( E[] inputArray) */
import java.util.*;
public class A3Q5_New{
    public static <E> void printArray(E [] inputArray){
        for(E element : inputArray){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Integer array : ");
        int n = sc.nextInt();
        Integer [] Int_arr = new Integer[n];
        System.out.println("Enter Integer array elements : ");
        for(int i = 0 ; i< Int_arr.length ; i++){
            Int_arr[i] = sc.nextInt();
        }
        System.out.println("Integer array contains : ");
        printArray(Int_arr);
        System.out.println("Enter the number of elements in the Double array : ");
        int N = sc.nextInt();
        Double [] Double_arr = new Double[N];
        System.out.println("Enter Double array elements : ");
        for(int i = 0 ; i < Double_arr.length ; i++){
            Double_arr[i] = sc.nextDouble();
        }
        System.out.println("Double array contains : ");
        printArray(Double_arr);
        sc.close();
    }
}