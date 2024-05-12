/*Write a java method using Generics to count the occurrence of an element in an array of
any type. The signature of count method is given below.
public static <T> int count(T[] array, T item) */
import java.util.*;
public class A3Q6_New {
    public static <T> int count(T[] array , T item){
        int count = 0 ;
        for(T element : array ){
            if(element.equals(item)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer array

        System.out.println("Enter the number of elements in the Integer array : ");
        int n = sc.nextInt();
        Integer[] Int_arr = new Integer[n];
        System.out.println("Enter array elements : ");
        for(int i = 0 ; i< n ; i++){
            Int_arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched in the Integer array : ");
        int  item1 = sc.nextInt();
        int result1 = count(Int_arr,item1);
        System.out.println("Number of times  "+ item1 + " is present in the array : "+ result1);

        // Double array

        System.out.println("Enter the number of elements in the Double  array : ");
        int N = sc.nextInt();
        Double[] Double_arr = new Double[N];
        System.out.println("Enter array elements : ");
        for(int i = 0 ; i< n ; i++){
            Double_arr[i] = sc.nextDouble();
        }
        System.out.println("Enter the element to be searched in the Integer array : ");
        double   item2 = sc.nextDouble();
        int result2 = count(Double_arr,item2);
        System.out.println("Number of times  "+ item2 + " is present in the array is :  "+ result2);
        sc.close();
    }
}
