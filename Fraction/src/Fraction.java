import java.util.Scanner;

public class Fraction
{
    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.simplify();
    }

    public int getNumerator()
    {
        return numerator;
    }
    public int getDenominator()
    {
        return denominator;
    }
    public void setNumerator(int numerator)
    {
        this.numerator=numerator;
    }
    public void setDenominator(int denominator)
    {
        this.denominator=denominator;
    }
    public String toString()
    {
        String ss=numerator+"/"+denominator;
        return ss;
    }
    Fraction(){};
    public void enter()
    {
        String strFraction=IBIO.input("Enter fraction (a/b) format");
        strFraction = strFraction.replace("/", " ");
        Scanner parse = new Scanner(strFraction);
        // to parse fraction
        numerator = parse.nextInt();
        denominator = parse.nextInt();
        //this.simplify();
    }
    public Fraction add(Fraction one)
    {
        int d=this.denominator*one.denominator;
        int n=(this.denominator*one.numerator)+(this.numerator*one.denominator);
        Fraction result=new Fraction(n,d);
        result.simplify();
        return result;

    }
    public static int GCD(int a, int b) {
        if (a == b) {
            return b;

        } else {
            while (a != b) {
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
            }
            return a;
        }
    }
    public void simplify()
    {
        int gcd=GCD(numerator, denominator);
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }

}
