import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int result = fact(num);
        System.out.println("The factorial of " +num+ " is : " +result);
        sc.close();
    }
    public static int fact(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num*fact(num-1);
        }

    } 
}

