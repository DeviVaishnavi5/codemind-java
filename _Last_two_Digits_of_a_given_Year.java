import java.util.*;
public class LastTwoDigits{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int lastTwoDigits=a%100;
        System.out.printf("%02d",lastTwoDigits);
    }
}