import java.util.Scanner;
public class GrossSalary{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float sal=sc.nextFloat();
        float hra=sc.nextFloat();
        float da=sc.nextFloat();
        float pf=0.12F*sal;
        System.out.printf("%.2f%n",pf);
        System.out.printf("%.2f",pf+sal+hra+da);
    }
}