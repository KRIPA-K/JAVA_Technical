import java.util.Scanner;
import java.math.*;
public class DiffOfSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println("Enter the value for m : ");
        int m=sc.nextInt();
        int result = differenceofSum(n, m);
        System.out.println("System.out.println : " + result);

        sc.close();
    }
    public static int differenceofSum(int n, int m){
        int numbers_divisible=0;
        int numbers_not_divisible=0;
        for(int i=0; i<=m; i++){
            if(i%n == 0){
                numbers_divisible+=i;
            }
            else{
                numbers_not_divisible+=i;
            }
           
        }
        return Math.abs(numbers_divisible-numbers_not_divisible);
    }

}
