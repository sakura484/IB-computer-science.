public class Square extends Shape
{
    private double side;
    public void setSide(double side)
    {
        this.side=side;//Math.abs(side)
    }
    public double getSide()
    {
        return side;
    }
    public Square (String name, double length)
    {   super(name);
        side=length;
    }
    public double getArea()
    {
        double area;
        area =side*side;
        return area;
    }
    public boolean equals(Square square2)
    {
        return square2.getArea()==this.getArea()&&this.getPerimeter()==square2.getPerimeter();
    }
    public double compareTo(Square square2)
    {
       /* double compare = 0;
        if (square2.getArea()<this.getArea())
        {
            compare=this.getArea()- square2.getArea();
        }else{
            compare= square2.getArea()-this.getArea();
        }
        */
        return Math.abs(this.getArea()- square2.getArea());
    }
    public double getPerimeter()
    {
        double perimeter;
        perimeter=4*side;
        return perimeter;
    }
    public String toString()
    {
        return super.toString()+" Side: "+side+" Area: "+getArea()+" Perimeter :"+getPerimeter();
    }
}
