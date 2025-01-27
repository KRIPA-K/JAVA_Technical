import java.util.Scanner;
public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the array elements : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Enter the element to be found : ");
        int elem=sc.nextInt();
        boolean found = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == elem){
                System.out.println("Element found at the index : "+i);
                found = true;
                break;

            }
        }
        if(!found){
            System.out.println("Element not found ");
        }
        sc.close();
    }
}

