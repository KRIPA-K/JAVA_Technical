import java.util.Scanner;
public class AddPrimeIndixes {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the array size : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.print("Enter " +n+ " elements : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered Elements are : ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        for (int i = 2; i < arr.length; i++) {
            if (isPrime(i)) {
                sum += arr[i];
            }
            sc.close();
        }

        System.out.println("Sum of numbers at prime indexes: " + sum);
        isPrime(n);
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
