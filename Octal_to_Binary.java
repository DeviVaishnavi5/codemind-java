import java.util.*;
public class OctalTOBinary{
    public static void main(String[] TanakaNishinoya)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            String a=sc.next();
            int decimal=Integer.parseInt(a,8);
            String binary=Integer.toString(decimal,2);
            System.out.println(binary);
        }
    }
}