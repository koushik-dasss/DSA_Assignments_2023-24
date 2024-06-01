/* Define a base class Person with instance variable name, age. The instance variables
are initialized through constructors. The prototype of constructor is as below.
Person (string, int)
Define a derived class Employee with instance variables Eid, salary. The instance
variables are initialized through constructors. The prototype of constructor is as below.
Employee (string, int, int, double).
Another instance method of Employee class is empDisplay() to display the information
of employee details.
*/
import java.util.*;
class Person {
    String name;
    int age;
    Person(String name , int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person{
    int Eid;
    double salary;
    Employee(String n, int a, int eid, double salary) {
        super(n, a);
        this.Eid = eid;
        this.salary = salary;
    }
    void empDisplay() {
        System.out.println("Employee name is : " + name);
        System.out.println("Employee age is :  " + age );
        System.out.println("Employee  id is  : " + Eid);
        System.out.println("Employee salary is : " + salary);
    }

}
public class A2Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee name : ");
        String name = sc.nextLine();
        System.out.println("Enter Employee age :  ");
        int age = sc.nextInt();
        System.out.println("Enter Employee EId: ");
        int eid = sc.nextInt();
        System.out.println("Enter Employee Salary : ");
        double salary = sc.nextDouble();
        Employee E1 = new Employee(name, age, eid, salary);
        E1.empDisplay();
        sc.close();
    }
}
