import java.util.Scanner;
public class StringCompare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1 : ");
        String str1=sc.nextLine();
        System.out.println("Enter the String 2 : ");
        String str2=sc.nextLine();

        StringCompare(str1, str2);
        sc.close();

    }

    public static void StringCompare(String str1, String str2){
        if(str1.equals(str2)){
            System.out.println("Both are Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
