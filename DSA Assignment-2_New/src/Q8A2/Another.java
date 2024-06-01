package Q8A2;
import A2Q8.*;
public class Another implements Sports {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.inputDetails();
        obj.showDisplay();
        int Total = score1+score2+obj.mark1+obj.mark2;
        System.out.println("Score 1 is : "+ score1 + " and Score 2 is : "+ score2);
        System.out.println("The total marks is : "+ Total);
    }
}
