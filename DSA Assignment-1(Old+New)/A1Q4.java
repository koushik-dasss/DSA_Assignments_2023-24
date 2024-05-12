import java.util.Scanner;
public class A1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Traditional approach :- Iteration ( Will update the code with recursive approach  later on)
        // Iteration approach can't be based on user input .
        String str  = "CAR" ; // (For CARBON , more 3 conditions will be added )
        int l = str.length();
        for(int i = 0 ; i< l ; i++){
            for(int j = 0 ; j<l ; j++){
                for(int k = 0 ; k<l ; k++){
                    if(i!=j && j!=k && i!=k){
                        System.out.println(" "+ str.charAt(i)+ str.charAt(j)+ str.charAt(k));
                    }
                }
            }
        } 
        sc.close();
    }
    
}
