import java.lang.Math;

public class Cylinder extends Solid
{
    private double radius;
    private double height;
    public Cylinder(String name, int radius, int height)
    {
        super(name);
        this.radius = (double)radius;
        this.height = (double)height;
    }
    
    public double surfaceArea()
    {
        return 2*Math.PI*radius*height + 2*Math.PI*Math.pow(radius,2);
    }
    
    public double volume()
    {
        return Math.PI*Math.pow(radius,2)*height;
    }
}
