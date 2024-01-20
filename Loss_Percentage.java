import java.util.Scanner;
import java.lang.Math;
public class LossPer{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        int b=sc.nextInt();
        double c=(a-b);
        double loss=(c*100)/(a);
        System.out.printf("%.2f",loss);
    }
}