import java.util.Scanner;
public class KhToms
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        double s=(n*5)/18.00;
        System.out.printf("%.2f",s);
    }
}