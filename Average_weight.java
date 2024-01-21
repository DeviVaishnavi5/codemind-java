import java.util.Scanner;
public class AvgWt{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int av=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=(3*av)-a-b;
        System.out.println(c);
    }
}