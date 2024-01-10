import java.util.Scanner;
public class AreaOfTriangle{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        float s=(a+b+c)/2.0F;
        float ar=(s*(s-a)*(s-b)*(s-c));
        double area=Math.sqrt(ar);
        System.out.printf("%.2f",area);
    }
}