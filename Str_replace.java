import java.util.Scanner;
public class Str_replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        str_replace(str);
        sc.close();

    }
    public static void str_replace(String str){
        System.out.print(str.replace("a", "c"));

    }
    
}
