import java.lang.Math;

public class Cube extends RectangularPrism
{
    private double sideLength;
    
    public Cube(String name,double sideLength)
    {
        super(name,sideLength,sideLength,sideLength);
        this.sideLength = sideLength;
    }
    
    public double volume()
    {
        return Math.pow(sideLength,3);
    }
    
    public double surfaceArea()
    {
        return 6*Math.pow(sideLength,2);
    }
}
