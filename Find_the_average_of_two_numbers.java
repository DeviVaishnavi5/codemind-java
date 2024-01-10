import java.util.Scanner;
public class AvgOfNum{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float c=(a+b)/2.0F;
        System.out.printf("%.4f",c);
    }
}