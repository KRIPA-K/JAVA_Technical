import java.util.Scanner;
public class Reverse_SB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1 : ");
        String str1=sc.nextLine();
        System.out.println("Enter the String 2 : ");
        String str2=sc.nextLine();
        StringBuilder sb1=new StringBuilder(str1);
        StringBuilder sb2=new StringBuilder(str2);
        sb1.reverse();
        sb2.reverse();

        System.out.println("Reversed String 1: " + sb1.toString());
        System.out.println("Reversed String 2: " + sb2.toString());

        String result =  sb1.toString()+ " " +sb2.toString();
        System.out.println("The reveresed results of 2 strings is :" +result);

        sc.close();
    }
}
