import java.util.Scanner;
public class Program3
{
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sn.nextInt();
        int count=0,i=1;
        if(a%2==0)
        {
            a=a-1;
        }

        while(count<a)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
                count++;
            }
            i++;
            
        }
        
        
    }
}