import java.util.Scanner;
public class Rev_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        reverseNum(num);
        System.out.println("Reversed Number is : "+reverseNum(num));
        
        sc.close();
    }
    public static int reverseNum(int num){
        int rev = 0;
        int rem;
        while(num>0){
            rem = num%10;
            rev = (rev*10)+rem;
            num = num/10;
        }
        return rev;
    }
}
