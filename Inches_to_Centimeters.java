import java.util.Scanner;
public class InchToCenti{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        double in=2.54*h;
        System.out.printf("%.2f",in);
    }
}