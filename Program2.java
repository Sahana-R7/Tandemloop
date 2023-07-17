import java.util.Scanner;
public class Program2
{
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sn.nextInt();
        int count=1;
        for(int i=1;count<=a;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
                count++;
            }
        }
        
    }
}