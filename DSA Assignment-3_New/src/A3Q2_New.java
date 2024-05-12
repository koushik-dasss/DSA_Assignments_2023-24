/*Assign your favorite colors in an array. Identify 2 exceptions that may be generated & write
exceptional handler in Java.*/
import java.util.*;
public class A3Q2_New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[4];
        System.out.println("Enter four colours : " );
        for(int i = 0 ; i<4 ; i++){
            arr[i]= sc.nextLine();
        }
        try{
            int a = Integer.parseInt(arr[0]);
        }
        catch(NumberFormatException obj){
            System.out.println("Convert string to integer");
            System.out.println(obj);
            System.out.println("Enter one more colour : ");
            arr[0] = sc.nextLine();
        }
        try{
            arr[5]= "VIOLET";
        }
        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println(obj);
        }
        for(int i = 0 ; i<4 ; i++){
            System.out.println(arr[i]);
        }
    }
}
