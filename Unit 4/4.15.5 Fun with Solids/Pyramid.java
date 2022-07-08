import java.lang.Math;

public class Pyramid extends Solid
{
    private double length;
    private double width;
    private double height;
    public Pyramid(String name, double length, double width, double height)
    {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public double volume()
    {
        return length*width*height/3;
    }
    
    public double surfaceArea()
    {
        double halfLength = length/2;
        double halfWidth = width/2;
        double halfHeight = height/2;
        double one = width*length;
        double two = length*Math.sqrt(halfWidth*halfWidth+height*height);
        double three = width*Math.sqrt(halfLength*halfLength+height*height);
        double SA = (one+two+three);
        return SA;
    }
}
