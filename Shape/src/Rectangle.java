public class Rectangle extends Shape
{
    private double length;
    private double width;
    public Rectangle(String name, double length, double width)
    {
        super(name);
        this.length=length;
        this.width=width;
    }

    public void setLength(double length)
    {
        this.length=length;
    }
    public void setWidth(double length)
    {
        this.width=width;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public double getPerimeter()
    {
        return 2*width+2*length;
    }
    public double getArea()
    {
        return length*width;
    }
    public boolean equals(Rectangle R2)
    {
        return R2.getArea()==this.getArea();
    }
    public double compareTo(Rectangle r1)
    {
        double compare=0;
        if(r1.getArea()<this.getArea())
        {
            compare=this.getArea()-r1.getArea();
        }else{
            compare=r1.getArea()-this.getArea();
        }
        return compare;
    }
    public String toString()
    {
        return super.toString()+" Length: "+length+" Width: "+width+" Area: "+getArea()+" Perimeter :"+getPerimeter();
    }

}
