
import java.util.Scanner;

class Calculator{
    double a,b;
    Calculator(double a,double b)
    {
        this.a=a;
        this.b=b;

    }
    double add(){ return a+b;}
    double sub(){ return a-b;}
    double mul(){ return a*b;}
    double div(){ return a/b;}
}




public class Program1 {
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("a : ");
        double a=sn.nextInt();
        System.out.println("b : ");
        double b=sn.nextInt();
        System.out.println("Operator : ");
        String op=sn.next();
        Calculator obj=new Calculator(a,b);

        double c=0;
        switch(op)
        {
            case "+": c=obj.add();break;
            case "-": c=obj.sub();break;
            case "*": c=obj.mul();break;
            case "/": c=obj.div();break;
            default:System.out.println("Invalid ");

        }
      System.out.println(a+op+b+"="+c);


    }
}
