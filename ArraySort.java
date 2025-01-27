import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the array elements : ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Sorted elements are : ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
