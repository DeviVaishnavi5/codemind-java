import java.util.Scanner;
public class DiskCapacity{
public static void main(String[] hinata)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.printf("%d KB",(2*512*a*b*c)/1024);
}
}