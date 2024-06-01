/*
Create an abstract class Marks with three instance variables (markICP, markDSA,
and percentage) and an abstract method getPercentage(). Create two classes: CSE
with instance variable algoDesign, and NonCSE with instance variable enggMechanics. Both classes inherit the abstract class Marks and override the abstract method
getPercentage(). The constructor of class CSE takes the marks in three subjects
(markICP, markDSA, and algoDesign) as its parameters, and the constructor of class
NonCSE takes the marks in three subjects (markICP, markDSA, and enggMechanics)
as its parameters. Create an object for each of the two classes and print the percentage
of marks for both students.
*/
import java.util.*;
abstract class marks {
    int markICP, markDSA;
    double percentage1, percentage2;

    marks(int markICP, int markDSA) {
        this.markICP = markICP;
        this.markDSA = markDSA;
    }

    abstract double getPercentage();
}
class CSE extends marks{
    int algoDesign;
    CSE(int markICP , int markDSA , int algoDesign){
        super(markICP,markDSA);
        this.algoDesign = algoDesign;
    }
    double getPercentage(){
        percentage1 = (double)(markICP+markDSA+algoDesign)/3;
        return percentage1;
    }
}
class NonCSE extends marks{
    int enggMechanics;
    NonCSE(int markICP , int markDSA , int enggMechanics){
        super(markICP,markDSA);
        this.enggMechanics = enggMechanics;
    }
    double getPercentage(){
        percentage2 = (double)(markICP+markDSA+enggMechanics)/3;
        return percentage2;
    }
}
public class A2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ICP & DSA marks : ");
        int ICP = sc.nextInt();
        int DSA = sc.nextInt();
        System.out.println("Enter algo-design marks :");
        int algo = sc.nextInt();
        marks obj1 = new CSE(ICP,DSA,algo);
        System.out.println("CSE percentage is : "+ obj1.getPercentage());
        System.out.println("Enter engg. Mechanics marks : ");
        int enggM = sc.nextInt();
        marks obj2 = new NonCSE(ICP,DSA,enggM);
        System.out.println("Non CSE percentage is : "+ obj2.getPercentage());
        sc.close();
    }
}