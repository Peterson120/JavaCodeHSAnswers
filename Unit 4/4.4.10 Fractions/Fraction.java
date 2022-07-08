public class Fraction
{
       private int numerator;
       private int denominator;
       
       public Fraction(int theNumerator,int theDenominator)
       {
           numerator = theNumerator;
           denominator = theDenominator;
       }
       
       public String toString()
       {
           return numerator + "/" + denominator;
       }
}
