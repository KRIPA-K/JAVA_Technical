import java.util.Scanner;
public class HashString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        HashString(str);

        sc.close();
    }
    public static void HashString(String str){
        String hashes = " ";
        String temp = " ";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '#'){
                hashes = hashes + '#';
            }
            else{
                temp += str.charAt(i);
            }
            
        }
        String result = hashes+temp;
        System.out.println(result);
    }
}
