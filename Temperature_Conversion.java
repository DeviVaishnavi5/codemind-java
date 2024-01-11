import java.util.Scanner;
public class TempCon{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double f=32.0F+(a*(1.8F));
        System.out.printf("%.2f",f);
    }
}