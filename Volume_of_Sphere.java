import java.util.Scanner;
public class VolOfSphere{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextFloat();
        double v=(1.3333333)*(3.14)*a*a*a;
        System.out.printf("%.2f",v);
    }
}