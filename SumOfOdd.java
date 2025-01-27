import java.util.*;
public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n=sc.nextInt();
        int result=sumOfOdd(n);
        sumOfOdd(n);
        System.out.println("Sum of Odd Numbers is : "+result);
        sc.close();
    }
    public static int sumOfOdd(int n){
        int sum = 0;
        for(int i=0; i<=n; i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        return sum;
        
    }

    
}
