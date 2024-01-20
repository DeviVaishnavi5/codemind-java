import java.util.Scanner;
public class ProfPer
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double g=b-a;
        double gp=(g/a)*100;
        System.out.printf("%.2f",gp);
        
    }
}