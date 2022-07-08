public class Extremes
{
    private static Integer min;
    private static Integer max;
    
    // Constructor
    public Extremes()
    {
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
    }
    
    // Returns the difference
    // max - number
    public static Integer maxDiff(Integer number)
    {
        return max-number;
    }

    // Returns the difference
    // min - number
    public static Integer minDiff(Integer number)
    {
        return (min-number);
    }
    
    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        return "[" + min + ", " + max + "]";   
    }
}
