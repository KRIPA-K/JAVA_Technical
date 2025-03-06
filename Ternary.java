import java.util.*;
public class Ternary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        String result = ((number%2 == 0) ? ((number > 0) ? "Even-Positive" : "Even-Positive") : (number > 0) ? "Odd-Positive" : "Odd-Negative");
        System.out.println(result);
        

    }
}