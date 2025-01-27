import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        palindromeOfString(str);
        sc.close();
    }
    public static void palindromeOfString(String str){
        String rev="";
        for(int i=str.length() - 1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    
    }
}
