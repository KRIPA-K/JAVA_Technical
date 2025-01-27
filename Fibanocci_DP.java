import java.util.Scanner;
public class Fibanocci_DP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values : ");
        int n = sc.nextInt();
        sc.close();
        findFib(n);
    }
    public static void findFib(int n){

        int num1 = 0;
        int num2 = 1;
        for(int i=0; i<n; i++){
            System.out.println(num1);
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            
         }
    }
    
}
