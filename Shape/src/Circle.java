public class Circle extends Shape
{
    private double radius;
    private static final double PI=Math.PI;
    public Circle(String name, double radius)
    {
        super(name);
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getPerimeter()
    {
        double premiter;
        premiter=2*PI*radius;
        return premiter;
    }
    public double getArea()
    {
        double area;
        area=PI*radius*radius;
        return area;
    }
    public boolean equals(Circle c1)
    {
        return c1.getArea()==this.getArea();
    }
    public double compareTo(Circle c1)
    {
        double compare;
        if(c1.getArea()<this.getArea())
        {
            compare=this.getArea()-c1.getArea();
        }else{
            compare=c1.getArea()-this.getArea();
        }
        return compare;
    }
    public String toString()
    {
        return super.toString()+" Radius: "+radius+" Cricumstance: "+getPerimeter()+" Area: "+getArea()+" Perimeter :"+getPerimeter();
    }

}
