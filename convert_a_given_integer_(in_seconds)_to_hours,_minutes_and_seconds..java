import java.util.Scanner;
public class Time
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int h=n/3600;
        int m=(n%3600)/60;
        int s=n%60;
        System.out.printf("H:M:S-%d:%d:%d",h,m,s);
    }
}