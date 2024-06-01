package A2Q8;
import java.util.*;
public class Test extends Student {
    public int mark1, mark2;

    public void inputDetails() {
        super.inputDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark1 & mark2: ");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
    }
    public void showDisplay(){
        super.showDetails();
        System.out.println("Mark 1 is : "+ mark1);
        System.out.println("Mark 2 is : "+ mark2);
    }
}

