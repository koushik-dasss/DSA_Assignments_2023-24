/* Define an interface DetailInfo to declare methods display( ) & count( ). Another class
Person contains a static data member maxcount, instance member name & method
display( ) to display name of a person, count the no. of characters present in the name
of the person.*/
import java.util.*;
interface DetailInfo {
    void display();
    void count();
}
class PersonQ7 implements DetailInfo {
    static int maxCount = 0 ;
    String name ;
    PersonQ7(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Name of the person is : "+ name);
        System.out.println("Number of characters present in the name is : "+ maxCount);
    }
    public void count(){
        for(int i = 0 ; i<name.length() ; i++){
            if(name.charAt(i)!=' '){
                maxCount++;
            }
        }
    }
}
public class A2Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person: ");
        String name = sc.nextLine();
        PersonQ7 obj = new PersonQ7(name);
        obj.count();
        obj.display();
        sc.close();
    }
}
