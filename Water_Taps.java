import java.util.Scanner;
public class WaterTaps
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int cap=(a*b)/(a+b);
        System.out.println(cap);
    }
}