/*Write a recursive Java method that determines if a string s is a palindrome, that is, it is
equal to its reverse. Examples of palindromes include 'racecar' and
'gohangasalamiimalasagnahog'. */
import java.util.*;
public class HA3Q6_New {
    public static boolean StringPalindrome(String s ){
        if(s.length()<=1){
            return true;
        }
        if(s.charAt(0)!=s.charAt(s.length()-1)){
            return false;
        }
        return StringPalindrome(s.substring(1,s.length()-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.next();
        System.out.println(s+" is a palindromic string : " + StringPalindrome(s));
        sc.close();
    }
}
