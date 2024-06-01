/*
Define a class Deposit. The instance variable of the class Deposit are mentioned
below.
1
Instance Variable Data Type
Principal Long
Time Integer
Rate Double
TotalAmt Double
Initialize the instance variables Principal, Time, rate through constructors. Constructors are overloaded with the following prototypes.
Constructor1: Deposit ( )
Constructor2: Deposit (long, int, double)
Constructor3: Deposit (long, int)
Constructor4: Deposit (long, double)
Apart from constructor, the other instance methods are
(i) display ( ): to display the value of instance variables,
(ii) calcAmt( ): to calculate the total amount.
totalAmt = Principal + (Principal x rate x Time)/100;
*/
import java.util.*;
class Deposit {
    long principal;
    int time;
    double ROI, totalAmt;
    Deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        principal = sc.nextLong();
        System.out.println("Enter the time: ");
        time = sc.nextInt();
        System.out.println("Enter ROI: ");
        ROI = sc.nextDouble();
    }
    Deposit(long p1, int t1, double r1) {
        principal = p1;
        time = t1;
        ROI = r1;
    }
    Deposit(long p1, int t1) {
        Scanner sc = new Scanner(System.in);
        principal = p1;
        time = t1;
        System.out.println("Enter ROI: ");
        ROI = sc.nextDouble();
    }
    Deposit(long p1, double r1) {
        Scanner sc = new Scanner(System.in);
        principal = p1;
        ROI = r1;
        System.out.println("Enter time: ");
        time = sc.nextInt();
    }
    void calAmt() {
        totalAmt = principal + (principal * ROI * time) / 100;
    }
    void display() {
        System.out.println("Principal is: " + principal);
        System.out.println("Time is: " + time);
        System.out.println("Rate of Interest is: " + ROI);
        System.out.println("Total amount is: " + totalAmt);
    }
}
public class A2Q4 {
    public static void main(String[] args) {
        Deposit d1 = new Deposit();
        d1.calAmt();
        d1.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        long p = sc.nextLong();
        System.out.println("Enter the ROI: ");
        double r = sc.nextDouble();
        System.out.println("Enter the time: ");
        int t = sc.nextInt();
        Deposit d2 = new Deposit(p, t, r);
        d2.calAmt();
        d2.display();
        Deposit d3 = new Deposit(p, t);
        d3.calAmt();
        d3.display();
        Deposit d4 = new Deposit(p, r);
        d4.calAmt();
        d4.display();
    }
}
