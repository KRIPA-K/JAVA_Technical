import java.util.*;
public class GreatestOfTwoNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value : ");
        int a=sc.nextInt();
        System.out.println("Enter the second value : ");
        int b=sc.nextInt();
        int Greatest=GreatestOfTwo(a, b);
        System.out.println("Greatest is : "+Greatest);
        sc.close();
    }
    public static int GreatestOfTwo(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
        
    }
}
