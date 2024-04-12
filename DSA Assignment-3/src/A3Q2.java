/* Assign your favourite colours in an array. Identify 2 exceptions that may be generated & write
exceptional handler in Java. Also, display the four colours after handling any 2 exceptions.
Sample run:
Enter four colours
RED
BLUE
YELLOW
GREEN
Convert string to integer
java.lang.NumberFormatException: For input string: "RED"
Enter one more colour
VIOLET
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of
bounds for length 4
The colours entered are
VIOLET
BLUE
YELLOW
GREEN*/
import java.util.*;
public class A3Q2 {
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
