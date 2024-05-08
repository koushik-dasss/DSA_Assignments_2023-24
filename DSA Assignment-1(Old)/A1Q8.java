
/*
Write a java program to print M-by-N array in the tabular format. Also, display the sum of
elements of the array.

Sample Run:

Enter number of Row and Columns of 2D-Array: 3 3
Enter elements of 2D-Array: 1 2 3 2 3 4 3 4 5

The elements of 2D array are:
1 2 3
2 3 4
3 4 5

The sum of elements of the 2D-Array is 27
 */ 

import java.util.Scanner;
public class A1Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows and Columns of 2D-Array: ");
        int r = sc.nextInt(); // arr.length
        int c = sc.nextInt(); // arr[0].length
        int [] [] arr = new int[r][c];
        System.out.print("Enter elements of 2D-Array: ");
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j< arr[0].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of 2D-Array are : ");
        for(int i = 0 ; i<r ; i++){
            for(int j = 0 ; j<c ; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int sum = 0 ;
        for(int i = 0 ; i<r ; i++){
            for(int j = 0 ; j<c ; j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("The sum of elements of the 2D-Array  is :  "+ sum);

        sc.close();
    }
    
}
