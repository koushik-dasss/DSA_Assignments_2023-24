/*
Question-9:

Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
values using the following header:
public static double sumMajorDiagonal(double[][] m)

Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
major diagonal.  

Sample Run:

Enter a 4-by-4 matrix row by row:

1 2 3 4.0
5 6.5 7 8
9 10 11 12
13 14 15 16

Sum of the elements in the major diagonal is 34.5


*/
import java.util.Scanner;
public class A1Q9 {
    public static double sumMajorDiagonal(double[][] m){
        int sum = 0 ;
        for(int i = 0 ; i<4 ; i++){
            for(int j = 0 ; j<4 ; j++){
                if(m[i]==m[j]){
                    sum+=m[i][j];
                }
            }
        }
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-by-4 matrix row by row: ");
        double [] [] m = new double[4][4];
        for(int i = 0 ; i< m.length ; i++){
            for(int j = 0 ; j< m[0].length ; j++){
                m[i][j]= sc.nextDouble();
            }
        }
        for(int i = 0 ; i<4 ; i++){
            for(int j = 0 ; j<4 ; j++){
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m) );


        sc.close();
    }
    
}
