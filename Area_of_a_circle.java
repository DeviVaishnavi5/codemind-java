import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        float ar=(3.14F)*a*a;
        System.out.printf("%.2f",ar);
    }
}