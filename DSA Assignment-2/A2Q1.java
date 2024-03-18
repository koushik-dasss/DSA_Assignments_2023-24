/* 
1. Define a class Person with two instance variables:
 name and age
and two member methods:

 setData(): set the details of the person.
 displayData(): display the details of the person.

Now, create two objects of class person and initialize one object value directly (by
using the dot(.) operator name: “Rohan” and age: 20 ). Accept your name and age
through the keyboard and set them to another object using the setData() method.
Now display both the member variables using the displayData() method. Also, check
who is younger */
import java.util.*;
class person {
    int age ;
    String name;

   void setData(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name : ");
    name = sc.nextLine();
    System.out.println("Enter the age of the person : ");
    age = sc.nextInt();
    sc.close();
   }
   void displayData(){
    System.out.println("The name is : "+name );
    System.out.println("The age is : "+ age);
   }
}
public class A2Q1 {
    public static void main(String[] args) {
        person obj1 = new person();
        obj1.name = "Rohan";
        obj1.age = 20;
        obj1.displayData();
        person obj2 = new person();
        obj2.setData();
        obj2.displayData();
        if(obj2.age > obj1.age){
            System.out.println(obj1.name + " is younger than "+ obj2.name);
        }else{
            System.out.println(obj2.name + " is younger than "+ obj1.name);
        }
    }
    
}
