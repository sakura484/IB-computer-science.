import java.util.Enumeration;
import java.util.concurrent.SynchronousQueue;

public class FractionTest
{
   /* public static void main (String[] args)
    {
        Fraction f=new Fraction();
        f.enter();
        System.out.println(f);
    }
    */
    public static void main(String[] args)
    {
        Fraction a=new Fraction();
        a.enter();
        Fraction b=new Fraction();
        b.enter();
        Fraction c=new Fraction();
        c=a.add(b);
        System.out.println(c);
    }



}
