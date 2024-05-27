/*  Define a class called Complex with instance variables real, imag and instance methods

 void setData()
 void display(),
 public Complex add(Complex, Complex)

Write the main method in a separate class to implement the addition of two complex
number with the given method signature as above.
 */
import java.util.*;
class Complex{
    int real , imag ;
    void setData(){
        Scanner sc = new Scanner(System.in); // NOT CLOSING SCANNER CLASS AS setData method is being reused
        System.out.println("Enter the real value : ");
        real = sc.nextInt();
        System.out.println("Enter the imag. value : ");
        imag = sc.nextInt();
        
    }
    void display(){
        System.out.println("The number is : "+ real + " + " + imag + " i ");
    }
    Complex add(Complex C1 , Complex C2){
        Complex obj = new Complex();
        obj.real = C1.real + C2.real;
        obj.imag = C1.imag + C2.imag;
        return obj;

    }
}
public class A2Q2 {
    public static void main(String[] args) {
        Complex C1 = new Complex();
        Complex C2 = new Complex();
        C1.setData();
        C1.display();
        C2.setData();
        C2.display();
        Complex C3 = C1.add(C1,C2);
        C3.display();

        
    }
    
}
