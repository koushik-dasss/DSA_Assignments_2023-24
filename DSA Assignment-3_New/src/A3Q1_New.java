/* Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler.*/
import java.util.*;
public class A3Q1_New {
    public static void Lucky(int n ) throws NumberFormatException{
        // throws keyword is used to declare an exception in the method signature
        // not compulsory here as it's an unchecked exception
        // but compulsory for checked exception as throw keyword doesn't generate checked exception
        if(n<0){
            throw new NumberFormatException("Negative number ");
        }else{
            System.out.print("Your lucky number is : " );
            System.out.println(n);
        }

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your lucky number : ");
        int n = sc.nextInt();
        try{
            Lucky(n);
        }
        catch(NumberFormatException obj){
            System.out.println(obj);
        }
        finally {
            sc.close();
        }
    }
}
