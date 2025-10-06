public class Triangle extends Shape
{
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;
    Triangle(String name, double base, double height, double side1, double side2, double side3)
    {
        super(name);
        this.base=base;
        this.height=height;
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public void setBase(double base)
    {
        this.base=base;
    }
    public void setHeight(double height)
    {
        this.height=height;
    }
    public void setSide1(double side1)
    {
        this.side1=side1;
    }
    public void setSide2(double side2)
    {
        this.side2=side2;
    }
    public void setSide3(double side3)
    {
        this.side3=side3;
    }
    public double getHeight()
    {
        return height;
    }
    public double getBase()
    {
        return base;
    }
    public double getSide1()
    {
        return side1;
    }
    public double getSide2()
    {
        return side2;
    }
    public double getSide3()
    {
        return side3;
    }
    public double getArea()
    {
        return 0.5*base*height;
    }
    public double getPerimeter()
    {
        return side1+side2+side3;
    }
    public boolean equals(Triangle t1)
    {
        return t1.getArea()==this.getArea();
    }
    public double compareTo(Triangle t1)
    {
        double compare;
        if(t1.getArea()<this.getArea())
        {
            compare=this.getArea()-t1.getArea();
        }else{
        compare=t1.getArea()-this.getArea();
    }
        return compare;
    }
}
