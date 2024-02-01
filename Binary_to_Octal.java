import java.util.*;
public class BinaryToOcatl
{
    public static void main(String[] Daichi)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        String binary=sc.next();
        int decimal =Integer.parseInt(binary,2);
        String octal=Integer.toString(decimal,8);
        System.out.println(octal);
        }
    }
}