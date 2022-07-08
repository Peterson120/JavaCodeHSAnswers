public class Fraction implements Comparable<Fraction>
{
    private int num;
    private int denom;
    public Fraction(int a, int b)
    {
        num = a;
        denom = b;
    }
    
    public int compareTo(Fraction other)
    {
        int fnum = num;
        int snum = other.getNumerator();
        if(denom != other.getDenominator())
        {
            fnum *= other.getDenominator(); 
            snum *= denom;
        }
        
        return (int)Math.signum(fnum - snum);
    }
    
    public int getDenominator()
    {
        return denom;
    }
    
    public int getNumerator()
    {
        return num;
    }
    
    public boolean equals(Object other)
    {
        return other instanceof Fraction && compareTo((Fraction)other) == 0;
    }
}
