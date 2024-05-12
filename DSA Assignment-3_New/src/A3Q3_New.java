/*Create a class Student & enter mark, name of the student. If mark is more than 100, create
exception MarksOutOfBoundException & throw it using Java.
 */
import java.util.*;
class Student{
    String name ;
    int marks;
    void getData(String n , int m){
        name = n ;
        marks = m;
    }
}
class MarksOutOfBoundException extends  Exception{
    MarksOutOfBoundException(String S){
        super(S);
    }
}
public class A3Q3_New {
    public static void check_marks(String n ,int m ) throws MarksOutOfBoundException{
        if(m>100){
            throw new  MarksOutOfBoundException("Marks can't be greater than 100");
        }else{
            System.out.println(n+" has got  " + m);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student :  ");
        String n = sc.nextLine();
        System.out.println("Enter marks : ");
        int m = sc.nextInt();
        Student S1 = new Student();
        S1.getData(n,m);
        try{
            check_marks(n,m);
        }catch(MarksOutOfBoundException obj){
            System.out.println(obj);
        }finally {
            sc.close();
        }
    }
}
