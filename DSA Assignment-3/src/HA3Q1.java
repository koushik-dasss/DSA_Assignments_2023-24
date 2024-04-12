/* Question-1:
Create a class Bank with instance variables account_no, name, and balance of the customer.
If the input balance is less than or equal to zero then create an Exception called “Invalid
BalanceException” and throw it using Java. Display the custom message “Balance cannot be
less than 0”.
Sample run-1:
Enter name
Rahul
Enter Account number
1235
Enter balance
700
Details of the Account Holder
Name: Rahul
Account number: 1235
Balance: 700.0
Enter the money to withdraw
300
After withdraw, Balance = 400.0
Sample run-2:
Enter name
Rahul
Enter Account number
1235
Enter balance
700
Details of the Account Holder
Name: Rahul
Account number: 1235
Balance: 700.0
Enter the money to withdraw
900
InvalidBalanceException: Balance cannot be less than 0 */
import java.util.*;
class Bank{
    int account_no;
    String name;
    double balance;
    void getData(int a , String n , double b){
        name = n ;
        account_no = a ;
        balance = b ;
    }
}
class InvalidBalanceException extends Exception{
    InvalidBalanceException(String S){
        super(S);
    }
}
public class HA3Q1 {
    public static void check_balance(double b)throws InvalidBalanceException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the money to withdraw : ");
        double w = sc.nextDouble();
        if(b-w<0){
            throw new InvalidBalanceException("Balance cannot be less than 0");
        }else{
            System.out.println("After withdraw, Balance = "+ (b-w));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String n = sc.nextLine();
        System.out.println("Enter Account number : ");
        int a = sc.nextInt();
        System.out.println("Enter balance : ");
        double b = sc.nextDouble();
        System.out.println("Details of the Account Holder ");
        System.out.println("Name : "+ n);
        System.out.println("Account Number : "+ a);
        System.out.println("Balance : "+ b);
        try{
            check_balance(b);
        }catch(InvalidBalanceException obj){
            System.out.println(obj);
        }finally {
            sc.close();
        }
    }
}
