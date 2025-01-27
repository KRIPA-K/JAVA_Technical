import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the A value");
        float A=sc.nextFloat();
        System.out.println("Enter the B value");
        float B=sc.nextFloat();
        System.out.println("Enter the C value");
        float C=sc.nextFloat();
        averageOfNum(A, B, C);
        sc.close();

    }
    public static void averageOfNum(float A, float B, float C){
        float result = ((A+B+C)/3);
        System.out.println("Average is : "+result);
    }
}
