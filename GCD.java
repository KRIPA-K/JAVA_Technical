import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value : ");
        int a=sc.nextInt();
        System.out.println("Enter the second value : ");
        int b=sc.nextInt();
        findGCD(a,b);
        System.out.println("GCD of "+a+ " and "+b+ " is : " +findGCD(a,b));
        sc.close();
    }
    public static int findGCD(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return findGCD(b, a%b);
        }

    }

}
