public class Fraction
{
    // Create your instance variables and constructor here
    private int numerator;
    private int denominator;
    
    public Fraction(int x,int y)
    {
        numerator = x;
        denominator = y;
    }
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }
    
    public void setNumerator(int x) {
        numerator = x;
    }
    
    
    public void setDenominator(int x) {
        denominator = x;
    }
    
    public void add(Fraction other) {
        int firstNum = numerator * other.getDenominator();
        int secondNum = other.getNumerator() * denominator;
        denominator *= other.getDenominator();
        numerator = firstNum+secondNum;
    }
    
    public void subtract(Fraction other) {
        int firstNum = numerator * other.getDenominator();
        int secondNum = other.getNumerator() * denominator;
        denominator *= other.getDenominator();
        numerator = firstNum-secondNum;
    }
    
    public void multiply(Fraction other) {
        numerator = numerator * other.getNumerator();
        denominator = denominator * other.getDenominator();
    }
    
    public String toString() {
        return numerator + "/" + denominator;
    }
}
