/*Design a package that contains two classes Student & Test. The Student class has
data members as name, roll and instance methods inputDetails() & showDetails().
Similarly the Test class has data members as mark1, mark2 and instance methods
inputDetails(), showDetails(), Student is extended by Test. Another package carry
interface Sports with 2 attributes score1, score2. Find grand total mark & score in
another class. */
package A2Q8;
import java.util.*;
public class Student {
    String name ;
    int roll ;
    void inputDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        name = sc.nextLine();
        System.out.println("Enter the roll no. : ");
        roll = sc.nextInt();
    }
    void showDetails(){
        System.out.println("Name is : "+ name);
        System.out.println("Roll is : "+ roll);
    }
}
