import java.util.Arrays;
import java.util.Scanner;
public class StringSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size=sc.nextInt();
        sc.nextLine();
        String str[]=new String[size];

        System.out.print("Enter the String : ");
        for(int i=0; i<size; i++){
            str[i]=sc.nextLine();
        }
        Arrays.sort(str);
        System.out.print("Sorted String is : ");
        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
        }
        sc.close();
    }
}
