import java.util.*;
public class SwappingNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value : ");
        int a=sc.nextInt();
        System.out.println("Enter the second value : ");
        int b=sc.nextInt();
        swapNumbers(a, b);
        
        sc.close();
    }
    public static void swapNumbers(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping a = "+a+ " b = " +b);

    }
}
