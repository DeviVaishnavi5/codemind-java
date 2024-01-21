import java.util.Scanner;
public class Days
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int y=n/365;
        int w=(n-(y*365))/7;
        System.out.println(y);
        System.out.println(w);
    }
}