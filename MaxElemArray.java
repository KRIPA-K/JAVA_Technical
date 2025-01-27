
import java.util.Arrays;
import java.util.Scanner;
public class MaxElemArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the array elements : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted elements are : ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        int largest = findMax(arr);   
        System.out.println("Largest is : "+largest); 
        sc.close();

    }
    public static int findMax(int arr[]){
        return arr[arr.length-1];
        
    } 
    
}
